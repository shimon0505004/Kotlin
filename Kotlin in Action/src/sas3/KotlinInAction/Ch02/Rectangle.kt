package sas3.KotlinInAction.Ch02

import java.util.*

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
    get() {
        return height ==width
    }
}

fun createRandomRectangle(): Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(),random.nextInt())
}

fun main(args: Array<String>) {
    val randomRectangle = createRandomRectangle()
    println("rectangle has ${randomRectangle.height} height " +
            "${randomRectangle.width} width and is ${if(randomRectangle.isSquare) "" else "not"} a square")
}