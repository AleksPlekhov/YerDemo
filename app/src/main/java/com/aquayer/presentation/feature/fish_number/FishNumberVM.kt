package com.aquayer.presentation.feature.fish_number

import android.view.View
import com.aquayer.data.DosageFormulaUserHolder
import com.aquayer.data.FishNumber
import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.presentation.base.view_model.BaseViewModel
import com.aquayer.presentation.dagger.graph.AppGraph
import javax.inject.Inject


class FishNumberVM : BaseViewModel(), IFishNumberContract.ViewModel {


    @Inject
    lateinit var dosageFormulaHolder: DosageFormulaUserHolder


    override fun onCreate() {
        super.onCreate()
        AppGraph.addDosageComponent().inject(this)
        Lo.g("dosageFormulaHolder: $dosageFormulaHolder")
    }




    fun onClickFishFew(v: View) {
        dosageFormulaHolder.comboParts.add(FishNumber.Few_a)
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickFishMany(v: View) {
        dosageFormulaHolder.comboParts.add(FishNumber.Many_b)
        callViewControl(IViewControl.Navigator.Next())
    }

}