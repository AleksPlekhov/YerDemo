package com.aquayer.presentation.base.view_handler

import androidx.appcompat.app.AppCompatActivity


interface IViewHandler {
    fun handleControl(viewControl: IViewControl?)
}


open class BaseViewHandler(private val actContext: AppCompatActivity?) : IViewHandler {
    protected val Lo = com.aquayer.utils.Lo(this)

    override fun handleControl(viewControl: IViewControl?) {
        viewControl?.action(actContext)
    }
}
