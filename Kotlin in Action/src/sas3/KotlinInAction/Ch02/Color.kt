package sas3.KotlinInAction.Ch02

enum class Color (val r: Int, val g: Int, val b: Int){
    /**
     * Only place in kotlin where you need to use semicolon
     * is in a enum class. This is necessary to seperate enum
     * methods from enum constant lists.
     */
    RED (255, 0, 0),
    ORANGE (255,165,0),
    YELLOW (255, 255, 0),
    GREEN (0, 255, 0),
    BLUE (0, 0, 255),
    INDIGO (75,0, 130),
    VIOLET (238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b

}

/**
 * When is the switch statement for kotlin.
 * Unlike in java, you dont need to write break
 * statements in each branch.
 * If a match is successful, only the corresponding
 * branch is executed.
 */

fun getMnemonic(color: Color) =
        when(color){
            Color.RED -> "Richard"
            Color.BLUE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.ORANGE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }

fun getWarmth(color: Color) = when(color){
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "Neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(Color.BLUE.rgb())
    println(getMnemonic(Color.ORANGE))
    println(getWarmth(Color.ORANGE))
    println(getWarmth(Color.INDIGO))
}
