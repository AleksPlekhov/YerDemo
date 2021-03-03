package com.aquayer.presentation.feature.water_volume

import android.view.View
import androidx.lifecycle.MutableLiveData
import com.aquayer.R
import com.aquayer.data.DosageFormulaUserHolder
import com.aquayer.presentation.base.IStateHolder
import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.presentation.base.view_model.BaseViewModel
import com.aquayer.presentation.base.view_model.StateHolderViewModel
import com.aquayer.presentation.dagger.graph.AppGraph
import com.aquayer.presentation.feature.fish_number.IFishNumberContract
import java.util.*
import javax.inject.Inject

class WaterVolumeVHolder : IStateHolder {
    var waterVolume: Double = 0.0
    var arrayMap = mutableListOf<Triple<Double, Int, Int>>()
}


class WaterVolumeVM : StateHolderViewModel<WaterVolumeVHolder>(::WaterVolumeVHolder),
    IFishNumberContract.ViewModel,
    IWaterVolumeContract.ViewModel {


    val waterVolume = MutableLiveData<String>()

    val urlAdv = MutableLiveData<String>().apply {
        value = "http://aquayer.com/app-news.png?=${UUID.randomUUID()}"
    }


    @Inject
    lateinit var dosageFormulaHolder: DosageFormulaUserHolder


    override fun onCreate() {
        super.onCreate()
        //Lo.ge("onCreate WaterVolumeVM: ${waterVolume.value}")
        AppGraph.addDosageComponent().inject(this)
        dosageFormulaHolder.comboParts.clear()
    }


    fun onClickNext(v: View) {
        provideNextStep()

    }

    fun onClickAdv() {
        callViewControl(IViewControl.Action.BrowseTo(R.string.url_adv))
    }


    override fun onRestoreState(dataHolder: WaterVolumeVHolder) {
        dosageFormulaHolder.waterVolume = dataHolder.waterVolume
    }

    override fun onSaveState(dataHolder: WaterVolumeVHolder) = WaterVolumeVHolder().also { holder ->
        holder.waterVolume = dosageFormulaHolder.waterVolume
    }


    override fun provideNextStep() {
        if (fieldValid()) {
            dosageFormulaHolder.waterVolume = waterVolume.value!!.toDouble()
            callViewControl(IViewControl.Navigator.Next())
        } else
            callViewControl(IViewControl.Action.ShowToast().apply {
                resId = R.string.tv_enter_volume
            })

    }

    private fun fieldValid() = !waterVolume.value.isNullOrBlank()

}