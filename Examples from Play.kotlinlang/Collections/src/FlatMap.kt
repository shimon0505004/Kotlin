package com.shawonarefin.collections.list

/**
 * flatMap transforms each element of a collection into an iterable object.
 * and builds a single list of transformation results. The transformation is
 * user-defined.
 */

fun main() {
    val numbers = listOf(1,2,3)
    val tripled = numbers.flatMap { listOf(it,it,it) }
    val tripled2 = numbers.flatMap { listOf(it,it*2,it*3) }
    println(tripled)
    println(tripled2)

}