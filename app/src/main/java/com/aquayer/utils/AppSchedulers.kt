package com.aquayer.utils


import io.reactivex.Scheduler
import kotlinx.coroutines.CoroutineDispatcher


data class AppRxSchedulers(
    val database: Scheduler,
    val disk: Scheduler,
    val network: Scheduler,
    val main: Scheduler
)

data class AppCoroutineDispatchers(
    val database: CoroutineDispatcher,
    val disk: CoroutineDispatcher,
    val network: CoroutineDispatcher,
    val main: CoroutineDispatcher
)
