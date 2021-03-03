package com.aquayer.presentation.dagger.module

import com.aquayer.data.DosageFormulaUserHolder
import com.aquayer.presentation.dagger.scope.DosageScope
import com.aquayer.utils.Lo
import dagger.Module
import dagger.Provides

@Module
class DosageModule() {


    @Provides
    @DosageScope
    fun provideDosageFormulaHolder() = DosageFormulaUserHolder()
}