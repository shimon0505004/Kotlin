package sas3.KotlinInAction.Ch02.BinaryConversion

import java.util.*

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()

    for(character in 'A'..'F'){
        val binary = Integer.toBinaryString(character.toInt())
        binaryReps[character] = binary
    }

    /**
     * This for loop allows unpacking an element of collection
     * we are iterating over (in this case, a collection of key/value
     * pairs in the map.
     */
    for((letter, binary) in binaryReps){
        println("${letter} : ${binary}")
    }
}