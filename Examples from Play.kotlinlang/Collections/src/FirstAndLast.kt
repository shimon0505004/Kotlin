package com.shawonarefin.collections.list

/**
 * first() function returns the first element in the collection.
 * last() function returns the last element in the collection.
 * first{}/last{} uses a predicate. In these cases, they return
 * the first or the last element that matches the given predicated.
 *
 * If the collection is empty or doesn't contain elements matching the
 * predicate, the function throw NoSuchElementException
 *
 */

fun main() {
    val numbers = listOf<Int>(1,-2,3,-4,5)
    val first = numbers.first()
    val last = numbers.last()

    //val firstEven = numbers.first { it%2==0 }
    //val lastOdd = numbers.last { it%2!=0 }
    //val notFound = numbers.first{ it == 7}

    val firstEven = try {
        numbers.first { it%2==0 }
    }catch (e: NoSuchElementException){
        null
    }

    val lastOdd = try {
        numbers.first { it%2!=0 }
    }catch (e: NoSuchElementException){
        null
    }
    val notFound = try {
        numbers.first { it == 7 }
    }catch (e: NoSuchElementException){
        null
    }

    println(first)
    println(last)
    println(firstEven)
    println(lastOdd)
    println(notFound)

    val words = listOf<String>("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    val firstFromEmpty = empty.firstOrNull()
    val lastFromEmpty = empty.lastOrNull()

    val firstF = words.firstOrNull { it.endsWith("f") }
    val lastZ = words.lastOrNull { it.endsWith("z") }

    println(firstFromEmpty)
    println(lastFromEmpty)
    println(firstF)
    println(lastZ)



}