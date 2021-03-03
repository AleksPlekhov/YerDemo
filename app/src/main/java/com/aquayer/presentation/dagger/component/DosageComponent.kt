package com.aquayer.presentation.dagger.component

import com.aquayer.presentation.dagger.module.DosageModule
import com.aquayer.presentation.dagger.scope.DosageScope
import com.aquayer.presentation.feature.aquarium_age.AquariumAgeVM
import com.aquayer.presentation.feature.co2_presence.Co2PresenceVM
import com.aquayer.presentation.feature.dosage.DosageVM
import com.aquayer.presentation.feature.fish_number.FishNumberVM
import com.aquayer.presentation.feature.lamp_power.LampPowerVM
import com.aquayer.presentation.feature.plants_kind.PlantsKindVM
import com.aquayer.presentation.feature.plants_number.PlantsNumberVM
import com.aquayer.presentation.feature.water_hardness.WaterHardnessVM
import com.aquayer.presentation.feature.water_volume.WaterVolumeVM
import dagger.Subcomponent


@DosageScope
@Subcomponent(
    modules = [
        DosageModule::class
    ]
)


interface DosageComponent {
    fun inject(obj: WaterVolumeVM)
    fun inject(obj: FishNumberVM)
    fun inject(obj: Co2PresenceVM)
    fun inject(obj: AquariumAgeVM)
    fun inject(obj: DosageVM)
    fun inject(obj: PlantsNumberVM)
    fun inject(obj: WaterHardnessVM)
    fun inject(obj: LampPowerVM)
    fun inject(obj: PlantsKindVM)

}