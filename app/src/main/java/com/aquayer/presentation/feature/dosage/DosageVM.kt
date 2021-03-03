package com.aquayer.presentation.feature.dosage

import android.view.View
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import androidx.lifecycle.MutableLiveData
import com.aquayer.BR
import com.aquayer.R
import com.aquayer.data.DosageFormulaUserHolder
import com.aquayer.data.FormulasFactory
import com.aquayer.presentation.aac.SingleLiveEvent
import com.aquayer.presentation.base.IStateHolder
import com.aquayer.presentation.base.view_handler.IViewControl
import com.aquayer.presentation.base.view_model.BaseViewModel
import com.aquayer.presentation.base.view_model.StateHolderViewModel
import com.aquayer.presentation.dagger.graph.AppGraph
import me.tatarka.bindingcollectionadapter2.ItemBinding
import javax.inject.Inject


interface OnDosageClickListener {
    fun onItemClick(item: ItemDosageVM)
}

class DosageHolder : IStateHolder {
    var waterVolume: Double = 0.0
    var arrayMap = mutableListOf<Triple<Double, Int, Int>>()
}


class DosageVM : StateHolderViewModel<DosageHolder>(::DosageHolder), IDosageContract.ViewModel, OnDosageClickListener {


    @Inject
    lateinit var dosageFormulaHolder: DosageFormulaUserHolder

    override val arrayMap = MutableLiveData<MutableList<Triple<Double, Int, Int>>>()

    override val redirectToLink = SingleLiveEvent<String>()

    override val items: ObservableList<ItemDosageVM> = ObservableArrayList()


    val itemBindings = ItemBinding
        .of<ItemDosageVM> { itemBinding, position, item ->
            itemBinding.set(
                BR.vm,
                R.layout.item_dosage
            )
        }.bindExtra(BR.listener, this@DosageVM)


    override fun onRestoreState(dataHolder: DosageHolder) {
        arrayMap.value = dataHolder.arrayMap
        dosageFormulaHolder.waterVolume = dataHolder.waterVolume
    }

    override fun onSaveState(dataHolder: DosageHolder) = DosageHolder().also { holder ->
        this@DosageVM.arrayMap.value?.run {
            holder.arrayMap = this
            holder.waterVolume = dosageFormulaHolder.waterVolume
        }
    }

    override fun onCreate() {
        super.onCreate()
        AppGraph.addDosageComponent().inject(this)
        arrayMap.value = FormulasFactory(dosageFormulaHolder).formulasMap()

    }

    override fun onItemClick(item: ItemDosageVM) {
        redirectToLink.value = item.url
    }


    fun onClickReCount(v: View) {
        callViewControl(IViewControl.Navigator.Next())
    }

    fun onClickHelp(v: View) {
        redirectToLink.postValue(v.context.getString(R.string.url_help))
    }


}