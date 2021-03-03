package com.aquayer.presentation.feature.aquarium_age

import android.view.View
import com.aquayer.data.AquariumAge
import com.aquayer.data.DosageFormulaUserHolder
import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.presentation.base.view_model.BaseViewModel
import com.aquayer.presentation.dagger.graph.AppGraph
import javax.inject.Inject

class AquariumAgeVM : BaseViewModel(), IAquariumAgeContract.ViewModel {


    @Inject
    lateinit var dosageFormulaHolder: DosageFormulaUserHolder


    override fun onCreate() {
        super.onCreate()
        AppGraph.addDosageComponent().inject(this)
        Lo.g("dosageFormulaHolder: $dosageFormulaHolder")
    }


    fun onClickAge1Month(v: View) {
        dosageFormulaHolder.comboParts.add(AquariumAge.Month1_o)
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickAgeMore18Months(v: View) {
        dosageFormulaHolder.comboParts.add(AquariumAge.Month18_p)
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickAgeOther(v: View) {
        callViewControl(IViewControl.Navigator.Next())
    }
}