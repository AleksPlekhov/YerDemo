package com.aquayer.presentation.feature.water_hardness

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.aquayer.R
import com.aquayer.databinding.FragmentWaterHardnessBinding
import com.aquayer.presentation.base.fragment.BindingFrag
import com.aquayer.utils.extensions.openHyperLink

class WaterHardnessFragment :
    BindingFrag<FragmentWaterHardnessBinding, WaterHardnessVM, IWaterHardnessContract.ViewModel>(),
    IWaterHardnessContract.ViewController {


    override val provideLayoutId = R.layout.fragment_water_hardness
    override var provideViewModel = WaterHardnessVM::class.java


    companion object {
        fun newInstance() = WaterHardnessFragment()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeRedirectByLink()
    }


    override fun observeRedirectByLink() {
        vm.redirectToLink.observe(this, Observer {
            it?.run {
                openHyperLink(this)
            }

        })
    }
}