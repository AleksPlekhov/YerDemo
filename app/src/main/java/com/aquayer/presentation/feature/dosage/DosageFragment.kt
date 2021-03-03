package com.aquayer.presentation.feature.dosage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.aquayer.R
import com.aquayer.databinding.FragmentDosageBinding
import com.aquayer.presentation.base.fragment.BindingFrag

class DosageFragment : BindingFrag<FragmentDosageBinding, DosageVM, IDosageContract.ViewModel>(),
    IDosageContract.ViewController {


    override val provideLayoutId = R.layout.fragment_dosage
    override var provideViewModel = DosageVM::class.java


    companion object {
        fun newInstance() = DosageFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeRedirectByLink()
        observeGettingItems()
    }

    override fun observeGettingItems() {
        vm.arrayMap.observe(this, Observer { arrayMap ->
            arrayMap.map {
                ItemDosageVM(
                    String.format(getString(it.second), it.first),
                    getString(it.third)
                )
            }.run {
                vm.items.addAll(this)
            }
        })
    }


    override fun observeRedirectByLink() {
        vm.redirectToLink.observe(this, Observer {
            it?.run {
                activity?.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(this)))
            }

        })
    }


}