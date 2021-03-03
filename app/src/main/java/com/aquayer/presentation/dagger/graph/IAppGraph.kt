package  com.aquayer.presentation.dagger.graph

import com.aquayer.AppMain
import com.aquayer.presentation.dagger.component.AppComponent
import com.aquayer.presentation.dagger.component.DosageComponent


interface IAppGraph {
    fun initialize(application: AppMain)
    fun appComponent(): AppComponent


    fun addDosageComponent(): DosageComponent
    fun removeDosageComponent()

}