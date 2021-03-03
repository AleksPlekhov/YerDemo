package com.aquayer.presentation.feature.co2_presence

import com.aquayer.R
import com.aquayer.databinding.FragmentCo2PresenceBinding
import com.aquayer.presentation.base.fragment.BindingFrag

class Co2PresenceFragment : BindingFrag<FragmentCo2PresenceBinding, Co2PresenceVM, ICo2PresenceContract.ViewModel>() {


    override val provideLayoutId = R.layout.fragment_co2_presence
    override var provideViewModel = Co2PresenceVM::class.java


    companion object {
        fun newInstance() = Co2PresenceFragment()
    }


}