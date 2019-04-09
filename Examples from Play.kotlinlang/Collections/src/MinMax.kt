package com.shawonarefin.collections.list

/**
 * min and max functions return the smallest and largest element of a collection.
 * If the collection is empty, they return null.
 */

fun main() {
    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()

    println("Numbers: ${numbers}, min = ${numbers.min()}, max = ${numbers.max()}")
    println("Numbers: ${empty}, min = ${empty.min()}, max = ${empty.max()}")
}