package com.aquayer.presentation.feature.lamp_power

import android.view.View
import com.aquayer.data.DosageFormulaUserHolder
import com.aquayer.data.LampPower
import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.presentation.base.view_model.BaseViewModel
import com.aquayer.presentation.dagger.graph.AppGraph
import javax.inject.Inject

class LampPowerVM : BaseViewModel(), ILampPowerContract.ViewModel {


    @Inject
    lateinit var dosageFormulaHolder: DosageFormulaUserHolder


    override fun onCreate() {
        super.onCreate()
        AppGraph.addDosageComponent().inject(this)
        Lo.g("dosageFormulaHolder: $dosageFormulaHolder")
    }


    fun onClickLampLum_1(v: View) {
        dosageFormulaHolder.comboParts.add(LampPower.Lum_1_h)
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickLampLum_0_7(v: View) {
        dosageFormulaHolder.comboParts.add(LampPower.Lum_0_7_j)
        callViewControl(IViewControl.Navigator.Next2())
    }

    fun onClickLampLed_0_5(v: View) {
        dosageFormulaHolder.comboParts.add(LampPower.Led_0_5_h)
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickLampLed_0_35(v: View) {
        dosageFormulaHolder.comboParts.add(LampPower.Led_0_35_j)
        callViewControl(IViewControl.Navigator.Next2())
    }
}