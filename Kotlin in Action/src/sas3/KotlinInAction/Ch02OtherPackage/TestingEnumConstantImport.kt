package sas3.KotlinInAction.Ch02OtherPackage

import sas3.KotlinInAction.Ch02.Color
import sas3.KotlinInAction.Ch02.Color.*

fun getWarmth(color: Color) = when(color){
    RED, ORANGE, YELLOW -> "Lukewarm"
    GREEN -> "Absolutely Neutral"
    BLUE, INDIGO, VIOLET -> "Slighly cold"
}

fun main(args: Array<String>) {
    println(getWarmth(ORANGE))
    println(getWarmth(INDIGO))
    println(sas3.KotlinInAction.Ch02.getWarmth(ORANGE))
}
