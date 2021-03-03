package com.aquayer

import android.app.Application
import android.content.Context
import com.aquayer.presentation.dagger.graph.AppGraph



class AppMain : Application() {
    companion object {
        var logPermission = BuildConfig.DEBUG
        lateinit var context: Context
    }


    override fun onCreate() {
        super.onCreate()
        context = this@AppMain
        AppGraph.initialize(this)


    }


}