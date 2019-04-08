package com.shawonarefin.collections.list

/**
 * map extension function is similar to filters in kotlin. It takes a lambda function as a lambda parameter.
 * It allows to apply a transformation to all elements in a collection.
 */

fun main() {
    val numbers = listOf(1, -2, 3, 4, -5, 6)
    val doubled = numbers.map { it*2 }
    val triple = numbers.map{ x -> x*3}

    println(numbers)
    println(doubled)
    println(triple)
}