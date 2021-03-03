@file:JvmName("FormulaKt")

package com.aquayer.data

import com.aquayer.R
import com.aquayer.utils.Lo


class FormulasFactory(private val dosageFormulaHolder: DosageFormulaUserHolder) {
    val list = mutableMapOf<List<IComboParts>, () -> IFormula>().apply {
        put(listOf(FishNumber.Many_b, Co2Presence.No_d), ::Formula1)
        put(listOf(FishNumber.Many_b, Co2Presence.No_d, AquariumAge.Month18_p), ::Formula2)
        put(listOf(FishNumber.Many_b, Co2Presence.No_d, AquariumAge.Month1_o), ::Formula3)
        put(listOf(FishNumber.Few_a, Co2Presence.No_d), ::Formula4)
        put(listOf(FishNumber.Few_a, Co2Presence.No_d, AquariumAge.Month18_p), ::Formula5)
        put(listOf(FishNumber.Few_a, Co2Presence.No_d, AquariumAge.Month1_o), ::Formula6)
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Few_e), ::Formula7)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Few_e), ::Formula8)
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Few_e, WaterHardness.More10_n), ::Formula9)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Few_e, WaterHardness.More10_n), ::Formula10)
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Few_e, AquariumAge.Month1_o), ::Formula11)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Few_e, AquariumAge.Month1_o), ::Formula12)
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Few_e,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula13
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Few_e,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula14
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Few_e,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula15
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Few_e,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula16
        )
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Few_e, AquariumAge.Month18_p), ::Formula17)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Few_e, AquariumAge.Month18_p), ::Formula18)
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Mid_f), ::Formula19)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Mid_f), ::Formula20)
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Mid_f, WaterHardness.More10_n), ::Formula21)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Mid_f, WaterHardness.More10_n), ::Formula22)
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Mid_f, AquariumAge.Month1_o), ::Formula23)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Mid_f, AquariumAge.Month1_o), ::Formula24)
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Mid_f,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula25
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Mid_f,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula26
        )
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Mid_f, AquariumAge.Month18_p), ::Formula27)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Mid_f, AquariumAge.Month18_p), ::Formula28)
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Mid_f,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula29
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Mid_f,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula30
        )
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Led_0_5_h), ::Formula31)
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Lum_1_h), ::Formula31)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Led_0_5_h), ::Formula32)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Lum_1_h), ::Formula32)
        put(
            listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Lum_1_h, WaterHardness.More10_n),
            ::Formula33
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                WaterHardness.More10_n
            ), ::Formula33
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                WaterHardness.More10_n
            ), ::Formula34
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                WaterHardness.More10_n
            ), ::Formula34
        )
        put(
            listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Lum_1_h, AquariumAge.Month1_o),
            ::Formula35
        )
        put(
            listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Led_0_5_h, AquariumAge.Month1_o),
            ::Formula35
        )
        put(
            listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Lum_1_h, AquariumAge.Month1_o),
            ::Formula36
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                AquariumAge.Month1_o
            ), ::Formula36
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula37
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula37
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula38
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula38
        )
        put(
            listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Lum_1_h, AquariumAge.Month18_p),
            ::Formula39
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                AquariumAge.Month18_p
            ), ::Formula39
        )
        put(
            listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Lum_1_h, AquariumAge.Month18_p),
            ::Formula40
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                AquariumAge.Month18_p
            ), ::Formula40
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula41
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula41
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula42
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula42
        )

        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Led_0_35_j), ::Formula43)
        put(listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Lum_0_7_j), ::Formula43)

        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Led_0_35_j), ::Formula44)
        put(listOf(FishNumber.Many_b, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Lum_0_7_j), ::Formula44)

        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_35_j,
                WaterHardness.More10_n
            ), ::Formula45
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_0_7_j,
                WaterHardness.More10_n
            ), ::Formula45
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_35_j,
                WaterHardness.More10_n
            ), ::Formula46
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_0_7_j,
                WaterHardness.More10_n
            ), ::Formula46
        )

        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_35_j,
                AquariumAge.Month1_o
            ), ::Formula47
        )
        put(
            listOf(FishNumber.Few_a, Co2Presence.Yes_c, PlantsNumber.Many_g, LampPower.Lum_0_7_j, AquariumAge.Month1_o),
            ::Formula47
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_35_j,
                AquariumAge.Month1_o
            ), ::Formula48
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_0_7_j,
                AquariumAge.Month1_o
            ), ::Formula48
        )

        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_35_j,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula49
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_0_7_j,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula49
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_35_j,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula50
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_0_7_j,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula50
        )

        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_35_j,
                AquariumAge.Month18_p
            ), ::Formula51
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_0_7_j,
                AquariumAge.Month18_p
            ), ::Formula51
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_35_j,
                AquariumAge.Month18_p
            ), ::Formula52
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_0_7_j,
                AquariumAge.Month18_p
            ), ::Formula52
        )


        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_35_j,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula53
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_0_7_j,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula53
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_35_j,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula54
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_0_7_j,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula54
        )


        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m
            ), ::Formula55
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m
            ), ::Formula55
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m
            ), ::Formula56
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m
            ), ::Formula56
        )

        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n
            ), ::Formula57
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n
            ), ::Formula57
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n
            ), ::Formula58
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n
            ), ::Formula58
        )



        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m,
                AquariumAge.Month1_o
            ), ::Formula59
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m,
                AquariumAge.Month1_o
            ), ::Formula59
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m,
                AquariumAge.Month1_o
            ), ::Formula60
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m,
                AquariumAge.Month1_o
            ), ::Formula60
        )

        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula61
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula61
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula62
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n,
                AquariumAge.Month1_o
            ), ::Formula62
        )

        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m,
                AquariumAge.Month18_p
            ), ::Formula63
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m,
                AquariumAge.Month18_p
            ), ::Formula63
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m,
                AquariumAge.Month18_p
            ), ::Formula64
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m,
                AquariumAge.Month18_p
            ), ::Formula64
        )

        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula65
        )
        put(
            listOf(
                FishNumber.Few_a,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula65
        )

        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Led_0_5_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula66
        )
        put(
            listOf(
                FishNumber.Many_b,
                Co2Presence.Yes_c,
                PlantsNumber.Many_g,
                LampPower.Lum_1_h,
                PlantsSlowGrowing.Yes_m,
                WaterHardness.More10_n,
                AquariumAge.Month18_p
            ), ::Formula66
        )


    }

    private fun getFormula(dosageFormulaHolder: DosageFormulaUserHolder): IFormula? {
        return list.entries.find { it.key == dosageFormulaHolder.comboParts }?.value?.invoke()
    }


    fun formulasMap(): MutableList<Triple<Double, Int, Int>> {

        val waterVolume = dosageFormulaHolder.waterVolume

        val formula = getFormula(dosageFormulaHolder)

        Lo.gge("formula: ${formula?.javaClass?.simpleName}")

        return mutableListOf<Triple<Double, Int, Int>>().apply {
            formula?.run {
                Lo.gge("formula microPlus_Y: ${microPlus_Y(waterVolume)}")
                microPlus_Y(waterVolume)?.run {
                    add(Triple(this.round(), R.string.dosage_micro_plus, R.string.url_micro_plus))
                }
                macroPlus_Z(waterVolume)?.run {
                    add(Triple(this.round(), R.string.dosage_macro_plus, R.string.url_macro_plus))
                }
                potashPlus_W(waterVolume)?.run {
                    add(Triple(this.round(), R.string.dosage_potash_plus, R.string.url_potash_plus))
                }
                ironPlus_V(waterVolume)?.run {
                    add(Triple(this.round(), R.string.dosage_iron_plus, R.string.url_iron_plus))
                }
            }

        }
    }


}


