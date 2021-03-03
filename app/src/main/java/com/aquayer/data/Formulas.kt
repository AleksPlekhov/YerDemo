package com.aquayer.data


interface IFormula {
    /**   Y == МИКРО+   */
    fun microPlus_Y(waterVolume: Double): Double? = null

    /**   Z == МАКРО+   */
    fun macroPlus_Z(waterVolume: Double): Double? = null

    /**   W == КАЛИЙ+   */
    fun potashPlus_W(waterVolume: Double): Double? = null

    /**   V == ЖЕЛЕЗО+   */
    fun ironPlus_V(waterVolume: Double): Double? = null
}


fun Double.round() = Math.round(this * 10.0) / 10.0


class Formula1 : IFormula {

    override fun microPlus_Y(waterVolume: Double) = removed
}

class Formula2 : IFormula {

    override fun microPlus_Y(waterVolume: Double) = removed
}

class Formula3 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula4 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed
    override fun macroPlus_Z(waterVolume: Double) = removed
}

class Formula5 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed
    override fun macroPlus_Z(waterVolume: Double) = removed
}

class Formula6 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed
    override fun macroPlus_Z(waterVolume: Double) = removed
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula7 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
}

class Formula8 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
}

class Formula9 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula10 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula11 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula12 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula13 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula14 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula15 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula16 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula17 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula18 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed
    override fun macroPlus_Z(waterVolume: Double) = removed * 2
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula19 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
}

class Formula20 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
}

class Formula21 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula22 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula23 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula24 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula25 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula26 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula27 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula28 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula29 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula30 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula31 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 4
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
}

class Formula32 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 4
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
}

class Formula33 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 4
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula34 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 4
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula35 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 4
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula36 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 4
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula37 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 4
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula38 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 4
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula39 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula40 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula41 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula42 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 2
    override fun macroPlus_Z(waterVolume: Double) = removed * 4
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula43 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
}

class Formula44 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
}

class Formula45 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula46 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula47 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula48 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula49 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula50 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula51 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula52 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula53 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula54 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}


class Formula55 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
}
class Formula56 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
}
class Formula57 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}
class Formula58 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula59 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}
class Formula60 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula61 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula62 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 3
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun potashPlus_W(waterVolume: Double) = removed
}

class Formula63 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula64 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula65 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}

class Formula66 : IFormula {
    override fun microPlus_Y(waterVolume: Double) = removed * 1.5
    override fun macroPlus_Z(waterVolume: Double) = removed * 3
    override fun ironPlus_V(waterVolume: Double) = removed
}


