package com.aquayer.presentation.feature.main

import com.aquayer.presentation.base.IViewVmContract
import com.aquayer.presentation.base.view_handler.IViewControl

interface IMainContract : IViewControl {

    /** Actions in direction  VM ---> View */
    interface ViewModel : IViewVmContract.IViewModelContract {

    }

    /** Actions in direction  VM <--- View */
    interface ViewController : IViewVmContract.IViewContract {

    }

}