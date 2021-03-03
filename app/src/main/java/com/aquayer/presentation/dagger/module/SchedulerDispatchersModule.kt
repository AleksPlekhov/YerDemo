package com.aquayer.presentation.dagger.module


import com.aquayer.utils.AppCoroutineDispatchers
import com.aquayer.utils.AppRxSchedulers
import dagger.Module
import dagger.Provides
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.rx2.asCoroutineDispatcher
import javax.inject.Singleton

@Module
class SchedulerDispatchersModule {

    @Provides
    @Singleton
    fun provideRxSchedulers() = AppRxSchedulers(
        database = Schedulers.single(),
        disk = Schedulers.io(),
        network = Schedulers.io(),
        main = AndroidSchedulers.mainThread()
    )

    @Provides
    @Singleton
    fun provideDispatchers(schedulers: AppRxSchedulers) = AppCoroutineDispatchers(
        database = schedulers.database.asCoroutineDispatcher(),
        disk = schedulers.disk.asCoroutineDispatcher(),
        network = schedulers.network.asCoroutineDispatcher(),
        main = Main
    )

}