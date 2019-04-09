package com.shawonarefin.collections.list

/**
 * zip function merges two given collections into a new collection. By default, the result collection contains
 * pairs of source collection elements with the same index. However, you can define your own structure of the
 * result collection element.
 *
 */

fun main() {
    val A = listOf<String>("a","b","c")
    val B = listOf(1,2,3,4)

    val resultPairs = A zip B
    val resultReduce = A.zip(B){ first,second ->"$first$second" }

    println(resultPairs)
    println(resultReduce)
}