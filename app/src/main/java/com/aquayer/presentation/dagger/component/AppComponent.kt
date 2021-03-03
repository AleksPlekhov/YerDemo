package com.aquayer.presentation.dagger.component

import com.aquayer.AppMain
import com.aquayer.presentation.dagger.module.AppModule
import com.aquayer.presentation.dagger.module.SchedulerDispatchersModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        SchedulerDispatchersModule::class
        // DashboardModule::class

    ]
)


interface AppComponent {
    fun inject(obj: AppMain)


    fun addDosageComponent(): DosageComponent

}