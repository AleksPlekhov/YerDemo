package com.aquayer.presentation.base.view_model

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import com.aquayer.presentation.base.view_handler.IViewControl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job


interface IVM {

    val viewModelJob: Job
    val uiScope: CoroutineScope


    fun handleOnCreate()

    /** Mandatory, is called at first time, here should be requests for heavy data */
    fun onCreate() {}

    /** Optional, is called each time after restoring */
    fun onRestore() {}

    fun callViewControl(viewControl: IViewControl)

    fun handleIntent(bundle: Bundle) {}

    fun onNewIntent(intent: Intent?) {}

    fun onAttachView(bn: Bundle?, intent: Intent?) {}

    fun onDestroy() {}

    fun onStart() {}

    fun onResume() {}

    fun onPause() {}

    fun onStop() {}

    fun onRestoreInstanceState(bn: Bundle) {}

    fun onSaveInstanceState(bn: Bundle) {}

    fun onOptionsItemSelected(menuItem: MenuItem) {}

    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {}

    fun onBackPressed(): Boolean {
        return true
    }

}