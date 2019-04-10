package com.shawonarefin.kotlin.scopefunctions

/**
 * also works like apply. It executes a given block and returns the object called.
 * Inside the block, the object is referenced by it, so it is easier to pass it as
 * an argument. This function is handy for embedding additional actions,
 * such as loggin in call chains.
 */

data class Person2(var name: String? = null,
                  var age:Int? = null,
                  var about: String? = null)

fun writeCreationLog(person: Person2){
    println("$person is a person")
}

fun main() {
    val jake = Person2("Jake", 30, "Android Developer")
        .also{
            writeCreationLog(it)
        }

    println(jake.toString())
}