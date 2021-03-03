package com.aquayer.presentation.feature.co2_presence

import android.view.View
import com.aquayer.data.Co2Presence
import com.aquayer.data.DosageFormulaUserHolder
import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.presentation.base.view_model.BaseViewModel
import com.aquayer.presentation.dagger.graph.AppGraph
import javax.inject.Inject

class Co2PresenceVM : BaseViewModel(), ICo2PresenceContract.ViewModel {


    @Inject
    lateinit var dosageFormulaHolder: DosageFormulaUserHolder


    override fun onCreate() {
        super.onCreate()
        AppGraph.addDosageComponent().inject(this)
        Lo.g("dosageFormulaHolder: $dosageFormulaHolder")
    }


    fun onClickYes(v: View) {
        dosageFormulaHolder.comboParts.add(Co2Presence.Yes_c)
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickNo(v: View) {
        dosageFormulaHolder.comboParts.add(Co2Presence.No_d)
        callViewControl(IViewControl.Navigator.Next2())
    }

}