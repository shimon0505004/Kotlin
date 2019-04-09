package com.shawonarefin.collections.list

/**
 * find() and findLast() functions return the first or the last collection element
 * that matches the given predicate. If there are no such elements, functions return
 * null.
 */

fun main() {

    val words = listOf<String>("Lets"
        , "find"
        , "something"
        , "in"
        , "collection"
        , "somehow")

    val first = words.find{it.startsWith("some")}
    val last = words.findLast{it.startsWith("some")}
    val nothing = words.findLast{it.startsWith("nothing")}

    println(first)
    println(last)
    println(nothing)

}