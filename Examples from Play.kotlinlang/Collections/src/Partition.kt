package com.shawonarefin.collections.list

/**
 * partition function splits the original collection into a pair of lists using a given predicate.
 * Elements for which the predicate is true.
 * Elements for which the predicate is false.
 */


fun main() {

    val numbers = listOf(1, -2, 3, 4, 5, -6)
    val evenOdd = numbers.partition { it%2==0 }
    println(evenOdd.first)
    println(evenOdd.second)

    val (positives, negatives) = numbers.partition { it>0 }
    println(positives)
    println(negatives)
}