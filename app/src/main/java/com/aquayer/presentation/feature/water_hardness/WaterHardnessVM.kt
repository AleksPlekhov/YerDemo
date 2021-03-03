package com.aquayer.presentation.feature.water_hardness

import android.view.View
import com.aquayer.R
import com.aquayer.data.DosageFormulaUserHolder
import com.aquayer.data.WaterHardness
import com.aquayer.presentation.aac.SingleLiveEvent
import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.presentation.base.view_model.BaseViewModel
import com.aquayer.presentation.dagger.graph.AppGraph
import javax.inject.Inject

class WaterHardnessVM : BaseViewModel(), IWaterHardnessContract.ViewModel {


    @Inject
    lateinit var dosageFormulaHolder: DosageFormulaUserHolder


    override val redirectToLink = SingleLiveEvent<String>()


    override fun onCreate() {
        super.onCreate()
        AppGraph.addDosageComponent().inject(this)
        Lo.g("dosageFormulaHolder: $dosageFormulaHolder")
    }


    fun onClickHardnessMore10(v: View) {
        dosageFormulaHolder.comboParts.add(WaterHardness.More10_n)
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickHardnessLess10(v: View) {
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickHardnessUnknown(v: View) {
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickTitle(v: View) {
        redirectToLink.value = v.context.getString(R.string.url_water_hardness)
    }

}