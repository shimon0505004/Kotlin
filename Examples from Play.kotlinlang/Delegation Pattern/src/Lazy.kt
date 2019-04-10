package com.shawonarefin.kotlinlang.delegationpattern

/**
 * Property lazy is not initialized on object creation.
 * The first call to get() executes the lambda expression passed to lazy()
 * as an argument and saves the result.
 * Further calls to get() return the saved result.
 */

class LazySample{
    init {
        println("created")
    }

    val lazyStr: String by lazy {
        println("computed")
        "my lazy"
    }
}

fun main(){
    val sample = LazySample()
    println("lazyStr = ${sample.lazyStr}")
    println(" = ${sample.lazyStr}")
}