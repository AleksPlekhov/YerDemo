package com.aquayer.presentation.feature.co2_presence

import com.aquayer.presentation.base.IViewVmContract
import com.aquayer.presentation.base.view_handler.IViewControl

interface ICo2PresenceContract : IViewControl {

    /** Actions in direction  VM ---> View */
    interface ViewModel : IViewVmContract.IViewModelContract {

    }

    /** Actions in direction  VM <--- View */
    interface ViewController : IViewVmContract.IViewContract {

    }

}