package com.shawonarefin.kotlin.scopefunctions

/**
 * Kotlin standard library function let can be used for scoping and null-checks.
 * When called on an object
 * let executes the given block of code and returns the result of its last expression.
 * The object is accessible inside the block by the reference it.
 */

fun customPrint(str: String){
    print(str.toUpperCase())
}

fun printNonNull(str: String?){
    println("Printing \"${str}\":")

    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}

fun main() {

    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }

    println(" is empty: ${empty}")
    printNonNull(null)
    printNonNull("my string")
}