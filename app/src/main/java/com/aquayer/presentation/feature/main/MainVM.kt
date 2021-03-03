package com.aquayer.presentation.feature.main

import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.presentation.base.view_model.BaseViewModel
import java.util.*

class MainVM : BaseViewModel(), IMainContract.ViewModel {

    private var backPressedCount = 0
    private var timeOfClick = 0L

    override
    fun onBackPressed(): Boolean {
        val curTimeInMillis = Calendar.getInstance().timeInMillis

        return if (backPressedCount++ == 0) {
            handleFirstClick()
        } else if (curTimeInMillis - timeOfClick > 2000) {
            handleFirstClick()
        } else true
    }

    private fun handleFirstClick(): Boolean {
        callViewControl(IViewControl.Action.ShowToast().apply {
            text = "Для выхода нажмите два раза подряд"
        })
        timeOfClick = Calendar.getInstance().timeInMillis
        return false
    }


}