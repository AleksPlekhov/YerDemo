package com.aquayer.presentation.feature.plants_number

import android.view.View
import com.aquayer.data.DosageFormulaUserHolder
import com.aquayer.data.PlantsNumber
import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.presentation.base.view_model.BaseViewModel
import com.aquayer.presentation.dagger.graph.AppGraph
import javax.inject.Inject

class PlantsNumberVM : BaseViewModel(), IPlantsNumberContract.ViewModel {


    @Inject
    lateinit var dosageFormulaHolder: DosageFormulaUserHolder


    override fun onCreate() {
        super.onCreate()
        AppGraph.addDosageComponent().inject(this)
        Lo.g("dosageFormulaHolder: $dosageFormulaHolder")
    }


    fun onClickPlantsMany(v: View) {
        dosageFormulaHolder.comboParts.add(PlantsNumber.Many_g)
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickPlantsFew(v: View) {
        dosageFormulaHolder.comboParts.add(PlantsNumber.Few_e)
        callViewControl(IViewControl.Navigator.Next2())
    }

    fun btnPlantsMid(v: View) {
        dosageFormulaHolder.comboParts.add(PlantsNumber.Mid_f)
        callViewControl(IViewControl.Navigator.Next2())
    }
}