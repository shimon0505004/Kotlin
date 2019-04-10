package com.shawonarefin.kotlin.scopefunctions

/**
 * with is a non-extension function that can access members of its argument concisely: you can omit the
 * instance name when referring to its members.
 */

data class Configuration(val host:String, val port:String?)

fun main() {
    val configuration = Configuration("100.0.0.10","1296")

    with(configuration){
        println("${host}:${port}")
    }

    //instead of
    println("${configuration.host}:${configuration.port}")
}