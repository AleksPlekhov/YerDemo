package com.aquayer.data

import com.aquayer.presentation.base.IStateHolder

data class DosageFormulaUserHolder(
    var waterVolume: Double = 0.0,
    var comboParts: MutableList<IComboParts> = mutableListOf()

) : IStateHolder