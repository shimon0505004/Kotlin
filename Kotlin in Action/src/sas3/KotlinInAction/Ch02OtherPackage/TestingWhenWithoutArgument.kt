package sas3.KotlinInAction.Ch02OtherPackage

import sas3.KotlinInAction.Ch02.Color
import sas3.KotlinInAction.Ch02.Color.*


fun mixOptimized(color1: Color, color2: Color) = when{
    ((color1 == RED && color2 == YELLOW)
            || (color1 == YELLOW && color2 == RED)) -> ORANGE

    ((color1 == YELLOW && color2 == BLUE)
            || (color1 == BLUE && color2 == YELLOW)) -> GREEN

    ((color1 == BLUE && color2 == VIOLET)
            || (color1 == VIOLET && color2 == BLUE)) -> ORANGE

    else -> throw Exception("Dirty Color")
}


fun main(args: Array<String>) {
    println(mix(Color.BLUE,Color.YELLOW))
}