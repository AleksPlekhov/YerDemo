package com.aquayer.presentation.base.view_handler


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.aquayer.R
import com.aquayer.utils.Lo
import org.jetbrains.anko.toast


interface IViewControl {
    fun action(activity: AppCompatActivity?)


    /** Actions  for navigation  to Activities/Fragments */
    sealed class Router : IViewControl {
        class CloseView : Router() {
            override fun action(activity: AppCompatActivity?) {
                activity?.finish()
            }
        }


        class OnBackClick : Router() {
            override fun action(activity: AppCompatActivity?) {
                activity?.onBackPressed()
            }
        }


        class StartActivity(private val clazz: Class<*>, private val bundle: Bundle? = null) :
            Router() {
            override fun action(activity: AppCompatActivity?) {
                val intent = Intent(activity, clazz)
                bundle?.run {
                    intent.putExtras(bundle)
                }
                activity?.startActivity(intent)
            }
        }

        class StartFragment(val fragment: Fragment) : Router() {
            override fun action(activity: AppCompatActivity?) {
                //activity?.supportFragmentManager?.addFragment(fragment)
            }
        }


    }


    /** Actions another, context addicted */
    sealed class Action : IViewControl {

        class ShowToast : Action() {
            var text: String? = null
            var resId: Int? = null

            override fun action(activity: AppCompatActivity?) {


                when {
                    resId != null -> activity?.getString(resId!!)
                    text != null -> text
                    else -> null
                }?.let {
                    activity?.toast(it)
                }


            }
        }

        class BrowseTo(val resId: Int) : Action() {

            override fun action(activity: AppCompatActivity?) {
                activity?.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(activity.getString(resId))
                    )
                )
            }
        }


    }


    /** Actions with Navigation Architecture Component */
    sealed class Navigator : IViewControl {

        protected fun provideNavController(
            activity: AppCompatActivity?,
            viewId: Int = R.id.nav_host_fragment
        ) =
            activity?.run { Navigation.findNavController(activity, viewId) }


        class Next : Navigator() {
            override fun action(activity: AppCompatActivity?) {

                provideNavController(activity)?.navigate(R.id.next_action)
            }
        }

        class Next2 : Navigator() {
            override fun action(activity: AppCompatActivity?) {

                provideNavController(activity)?.navigate(R.id.next_action_2)
            }
        }

        /*class Next3 : Navigator() {
            override fun action(activity: AppCompatActivity?) {

                provideNavController(activity)?.navigate(R.id.next_action_3)
            }
        }*/


        class Up : Navigator() {
            override fun action(activity: AppCompatActivity?) {
                Lo.gg("action Up")
                provideNavController(activity)?.popBackStack()
            }
        }


        class PrevAction : Navigator() {
            override fun action(activity: AppCompatActivity?) {
                provideNavController(activity)?.navigate(R.id.next_action)
            }
        }
    }


}
