package com.aquayer.presentation.feature.main

import android.os.Bundle
import com.aquayer.R
import com.aquayer.presentation.base.activity.BindingAct
import com.aquayer.databinding.ActivityMainBinding

class MainActivity : BindingAct<ActivityMainBinding, MainVM>(),
    IMainContract.ViewController {


    override val provideLayoutId = R.layout.activity_main
    override var provideViewModel = MainVM::class.java


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}