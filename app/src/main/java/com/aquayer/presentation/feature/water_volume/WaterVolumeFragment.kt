package com.aquayer.presentation.feature.water_volume

import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import com.aquayer.R
import com.aquayer.databinding.FragmentWaterVolumeBinding
import com.aquayer.presentation.base.fragment.BindingFrag

class WaterVolumeFragment : BindingFrag<FragmentWaterVolumeBinding, WaterVolumeVM, IWaterVolumeContract.ViewModel>(), IWaterVolumeContract.ViewController {


    override val provideLayoutId = R.layout.fragment_water_volume
    override var provideViewModel = WaterVolumeVM::class.java


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleEditText()
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

       // binding.imgAdv.setImageURI("http://aquayer.com/app-news.jpg")
    }


    private fun handleEditText() {
        binding.etLiter.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE)
                vm.provideNextStep()
            false
        }
    }


}