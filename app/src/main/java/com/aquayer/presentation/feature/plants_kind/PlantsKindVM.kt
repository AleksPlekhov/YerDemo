package com.aquayer.presentation.feature.plants_kind

import android.view.View
import com.aquayer.data.DosageFormulaUserHolder
import com.aquayer.data.PlantsSlowGrowing
import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.presentation.base.view_model.BaseViewModel
import com.aquayer.presentation.dagger.graph.AppGraph
import javax.inject.Inject

class PlantsKindVM : BaseViewModel(), IPlantsKindContract.ViewModel {



    @Inject
    lateinit var dosageFormulaHolder: DosageFormulaUserHolder


    override fun onCreate() {
        super.onCreate()
        AppGraph.addDosageComponent().inject(this)
        Lo.g("dosageFormulaHolder: $dosageFormulaHolder")
    }


    fun onClickYes(v: View) {
        dosageFormulaHolder.comboParts.add(PlantsSlowGrowing.Yes_m)
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickNo(v: View) {
        callViewControl(IViewControl.Navigator.Next())
    }


}