package com.aquayer.presentation.feature.plants_kind

import com.aquayer.presentation.base.IViewVmContract
import com.aquayer.presentation.base.view_handler.IViewControl

interface IPlantsKindContract : IViewControl {

    /** Actions in direction  VM ---> View */
    interface ViewModel : IViewVmContract.IViewModelContract {

    }

    /** Actions in direction  VM <--- View */
    interface ViewController : IViewVmContract.IViewContract {

    }

}