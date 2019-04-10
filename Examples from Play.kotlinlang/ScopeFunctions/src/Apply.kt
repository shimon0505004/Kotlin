package com.shawonarefin.kotlin.scopefunctions

/**
 * apply executes a block of code on an object and returns the object itself.
 * Inside the block, the object is referenced by this.
 * This function is handy for initializing objects.
 */

data class Person(var name: String? = null,
             var age:Int? = null,
             var about: String? = null)

fun main() {
    val jake = Person()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android Developer"
    }.toString()

    println(stringDescription)
}