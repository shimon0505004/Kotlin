package sas3.KotlinInAction.Ch02OtherPackage

import sas3.KotlinInAction.Ch02.Color
import sas3.KotlinInAction.Ch02.Color.*

fun mix(color1: Color, color2: Color) = when(setOf(color1,color2)){
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(GREEN, VIOLET) -> INDIGO
    else -> throw Exception("Dirty Color")
}


fun main(args: Array<String>) {
    println(mix(Color.BLUE,Color.YELLOW))
}
