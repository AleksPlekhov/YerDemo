package com.aquayer.presentation.feature.lamp_power

import com.aquayer.R
import com.aquayer.databinding.FragmentLampPowerBinding
import com.aquayer.presentation.base.fragment.BindingFrag

class LampPowerFragment : BindingFrag<FragmentLampPowerBinding, LampPowerVM, ILampPowerContract.ViewModel>() {


    override val provideLayoutId = R.layout.fragment_lamp_power
    override var provideViewModel = LampPowerVM::class.java


    companion object {
        fun newInstance() = LampPowerFragment()
    }


}