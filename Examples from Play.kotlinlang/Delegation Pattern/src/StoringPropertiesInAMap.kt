package com.shawonarefin.kotlinlang.delegationpattern

/**
 * Property delegation can be used for storing properties in a map.
 * This is handy for tasks like parsing JSON or doing other
 * "Dynamic" stuff
 */

class User(val map: Map<String, Any?>){
    val name: String    by map
    val age: Int        by map
}

fun main(){
    val user = User(mapOf(
        "name" to "John Doe",
        "age" to 25
    ))

    println("name = ${user.name}, age=${user.age}")
}