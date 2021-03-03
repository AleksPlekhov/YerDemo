package com.aquayer.data


/**   Y == МИКРО+   */
/**   Z == МАКРО+   */
/**   W == КАЛИЙ+   */
/**   V == ЖЕЛЕЗО+   */

interface IComboParts

sealed class FishNumber : IComboParts {
    object Few_a : FishNumber() // a
    object Many_b : FishNumber()// b
}

sealed class Co2Presence : IComboParts {
    object Yes_c : Co2Presence()// c
    object No_d : Co2Presence()// d
}

sealed class AquariumAge : IComboParts {
    object Month1_o : AquariumAge()// o
    object Month18_p : AquariumAge()// p
}

sealed class PlantsNumber : IComboParts {
    object Many_g : PlantsNumber()// g
    object Few_e : PlantsNumber()// e
    object Mid_f : PlantsNumber()// f
}

sealed class WaterHardness : IComboParts {
    object More10_n : WaterHardness()// n
}

sealed class LampPower : IComboParts {
    object Lum_1_h : LampPower()// h
    object Lum_0_7_j : LampPower()// j
    object Led_0_5_h : LampPower()// h
    object Led_0_35_j : LampPower()// j
}

sealed class PlantsSlowGrowing : IComboParts {
    object Yes_m : PlantsSlowGrowing()// m
}

