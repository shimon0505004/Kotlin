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

fun main(args: Array<String>) {
    println(Color.BLUE.rgb())
}