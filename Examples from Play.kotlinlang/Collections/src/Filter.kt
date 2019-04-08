package com.shawonarefin.collections.list

/**
 * Filter function enables you to filter collections.
 * It takes a filter predicate as a lambda parameter.
 * The predicate is applied for each element. Elements
 * that make the predicate true are returned in the
 * results collection.
 */

fun main() {
    val numbers = listOf(1,2,3,-4,5,6)
    val positives = numbers.filter { number -> number>0 }
    val negatives = numbers.filter { it<0 }

    println(positives)
    println(negatives)
}