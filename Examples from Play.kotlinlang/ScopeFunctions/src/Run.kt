package com.shawonarefin.kotlin.scopefunctions

/**
 * Like let, run is another scoping function from the standard library.
 * run does the same thing as let. It executes a code block and returns
 * its result. The difference is that run object is accessed by this.
 * this is useful when you want to call the object's methods rather
 * than pass it as an argument.
 */

fun getNullableLength(ns: String?){
    println("for \"$ns \"")
    ns?.run {
        println("\tis empty? " + this.isEmpty())
        println("\tlength = ${this.length}")
        length
        //it.isEmpty()
    }
}

fun main() {
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with kotlin")
}