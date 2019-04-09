package com.shawonarefin.collections.list

/**
 * count() functions returns either the total number of elements in a
 * collection or the number of elements matching the given predicate.
 */

val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

fun main() {
    val totalCount = numbers.count()
    val evenCount = numbers.count { it%2==0 }

    println(totalCount)
    println(evenCount)
}