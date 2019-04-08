package com.shawonarefin.collections.list

/**
 * Any, all, none functions check the existance of collection elements that match a given predicate.
 *
 */

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val anyNegative = numbers.any{ it<0 }
    val anyGT6 = numbers.any{ it>6 }
    val allPositive = numbers.all{ it>0 }
    val allLE10 = numbers.all{ it<10 }
    val noneLEneg10 = numbers.none{ it<-10}

    println("Is there any negative numbers? ${anyNegative}")
    println("Is there any number greater than 6? ${anyGT6}")
    println("Are all numbers positive? ${allPositive}")
    println("Are all numebers less than 10? ${allLE10}")
    println("Are none of the numbers less than -10? ${noneLEneg10}")


}