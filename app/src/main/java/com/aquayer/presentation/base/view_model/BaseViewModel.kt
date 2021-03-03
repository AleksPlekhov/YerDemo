package com.aquayer.presentation.base.view_model

import androidx.lifecycle.ViewModel
import com.aquayer.presentation.aac.SingleLiveEvent
import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.utils.AppCoroutineDispatchers
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import javax.inject.Inject

abstract class BaseViewModel : ViewModel(), IVM {
    val Lo = com.aquayer.utils.Lo(this)
    var disposables = CompositeDisposable()

    private var isJustCreated = true

    val viewHandler = SingleLiveEvent<IViewControl>()


    @Inject
    lateinit var appCoroutineDispatchers: AppCoroutineDispatchers

    /**
     * This is the job for all coroutines started by this ViewModel.
     *
     * Cancelling this job will cancel all coroutines started by this ViewModel.
     */
    override val viewModelJob = Job()
    /**
     * This is the main scope for all coroutines launched by MainViewModel.
     *
     * Since we pass viewModelJob, you can cancel all coroutines launched by uiScope by calling
     * viewModelJob.cancel()
     */
    override val uiScope by lazy { CoroutineScope(appCoroutineDispatchers.main + viewModelJob) }


    override fun callViewControl(viewControl: IViewControl) {
        viewHandler.value = viewControl
    }


    /** Constructor, just for debug */
    init {
        isJustCreated = true
    }


    override fun handleOnCreate() {

        if (isJustCreated) {
            isJustCreated = false
            onCreate()
        } else
            onRestore()
    }

    override fun onCreate() {
        super.onCreate()
       // Lo.g("onCreate ${this.hashCode()}")
    }

    override fun onDestroy() {
        //this.view = null
       // Lo.ge("onDestroy ${this.hashCode()}")
        viewModelJob.cancel()
        disposables.clear()
    }


    override fun onCleared() {
        //   Lo.g("onCleared ${this.hashCode()}")
        onDestroy()
        super.onCleared()

    }


}