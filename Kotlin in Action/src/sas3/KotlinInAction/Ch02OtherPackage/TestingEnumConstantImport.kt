package sas3.KotlinInAction.Ch02OtherPackage

/**
 * We have to use two imports here, both .../color and .../color.*
 * .../color enables us to access the enum class color, but not the enum values.
 * to access the enum values, we need to explicitly import enum constants to
 * use them by name. This is done using .../color.*
 */

import sas3.KotlinInAction.Ch02.Color
import sas3.KotlinInAction.Ch02.Color.*

fun getWarmth(color: Color) = when(color){
    RED, ORANGE, YELLOW -> "Lukewarm"
    GREEN -> "Absolutely Neutral"
    BLUE, INDIGO, VIOLET -> "Slighly cold"
}

fun main(args: Array<String>) {
    /**
     * We have two top level functions with same name in different package.
     * If we dont explicitly mention the package, then it is the local
     * package's top level function. To access the top level function of a
     * different package, we need to prefix it with the package name.
     */
    println(getWarmth(ORANGE))
    println(getWarmth(INDIGO))
    println(sas3.KotlinInAction.Ch02.getWarmth(ORANGE))
}
