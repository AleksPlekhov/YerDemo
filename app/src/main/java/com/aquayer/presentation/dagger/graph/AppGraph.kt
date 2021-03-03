package com.aquayer.presentation.dagger.graph

import com.aquayer.AppMain
import com.aquayer.presentation.dagger.component.AppComponent
import com.aquayer.presentation.dagger.component.DaggerAppComponent
import com.aquayer.presentation.dagger.component.DosageComponent
import com.aquayer.presentation.dagger.module.AppModule


object AppGraph : IAppGraph {

    private lateinit var appComponent: AppComponent
    private var dosageComponent: DosageComponent? = null


    override fun appComponent(): AppComponent = appComponent

    override fun initialize(application: AppMain) {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(application))
            .build().apply {
                inject(application)
            }
    }


    override fun addDosageComponent(): DosageComponent {

        if (dosageComponent == null)
            dosageComponent = appComponent().addDosageComponent()
        return dosageComponent!!
    }

    override fun removeDosageComponent() {
        dosageComponent = null
    }


}