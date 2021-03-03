package com.aquayer.presentation.feature.water_hardness

import com.aquayer.presentation.aac.SingleLiveEvent
import com.aquayer.presentation.base.IViewVmContract
import com.aquayer.presentation.base.view_handler.IViewControl

interface IWaterHardnessContract : IViewControl {

    /** Actions in direction  VM ---> View */
    interface ViewModel : IViewVmContract.IViewModelContract {
        val redirectToLink: SingleLiveEvent<String>
    }

    /** Actions in direction  VM <--- View */
    interface ViewController : IViewVmContract.IViewContract {
        fun observeRedirectByLink()
    }

}