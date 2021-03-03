package com.aquayer.presentation.base.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.aquayer.BR
import com.aquayer.presentation.base.IViewVmContract
import com.aquayer.presentation.base.view_handler.BaseViewHandler
import com.aquayer.presentation.base.view_model.BaseViewModel
import com.aquayer.presentation.binding.AppBindingComponent
import com.aquayer.utils.Lo
import io.reactivex.disposables.CompositeDisposable

abstract class BindingFrag<Bind : ViewDataBinding, VM : BaseViewModel, VmContract : IViewVmContract.IViewModelContract> : Fragment() {
    protected val Lo: Lo = Lo(this)
    protected abstract var provideViewModel: Class<VM>
    protected abstract val provideLayoutId: Int
    protected open val provideViewHandler by lazy { BaseViewHandler(this.activity as? AppCompatActivity) }

    private val viewModel by lazy { ViewModelProviders.of(this).get(provideViewModel) }

    protected val vm by lazy { viewModel as VmContract}

    protected lateinit var binding: Bind
    private fun provideVariable(): Int = BR.vm


    protected var disposables = CompositeDisposable()


    private fun initViewHandler() {
        viewModel.viewHandler.observe(this, Observer {
            //Lo.g("initViewHandler ${it.hashCode()} | $it")
            provideViewHandler.handleControl(it)
        }
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // Lo.g("onCreate:")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //   Lo.ge("onCreateView ")
        initViewHandler()
        DataBindingUtil.setDefaultComponent(AppBindingComponent())
        binding = DataBindingUtil.inflate(inflater, provideLayoutId, container, false)
        binding.setVariable(provideVariable(), viewModel)
        binding.executePendingBindings()
        binding.lifecycleOwner = this

        viewModel.handleOnCreate()


        return binding.root
    }


    override fun onSaveInstanceState(outState: Bundle) {
        // Lo.g("onSaveInstanceState: $outState")
        viewModel.onSaveInstanceState(outState)
        super.onSaveInstanceState(outState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        // Lo.g("onViewStateRestored: $savedInstanceState")
        savedInstanceState?.run {
            viewModel.onRestoreInstanceState(this)
        }

        super.onViewStateRestored(savedInstanceState)

    }


    override fun onStart() {
        super.onStart()
        viewModel.onStart()
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()

    }

    override fun onPause() {
        viewModel.onPause()
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        viewModel.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
       // Lo.g("onDestroy")
    }

}