package com.aquayer.presentation.feature.dosage

import androidx.databinding.ObservableList
import androidx.lifecycle.MutableLiveData
import com.aquayer.presentation.aac.SingleLiveEvent
import com.aquayer.presentation.base.IViewVmContract
import com.aquayer.presentation.base.view_handler.IViewControl

interface IDosageContract : IViewControl {

    /** Actions in direction  VM ---> View */
    interface ViewModel : IViewVmContract.IViewModelContract {
        val arrayMap: MutableLiveData<MutableList<Triple<Double, Int, Int>>>
        val items: ObservableList<ItemDosageVM>
        val redirectToLink: SingleLiveEvent<String>
    }

    /** Actions in direction  VM <--- View */
    interface ViewController : IViewVmContract.IViewContract {
        fun observeRedirectByLink()
        fun observeGettingItems()
    }

}