package com.shawonarefin.collections.list

/**
 * A set is an unordered collection that does not support duplicates.
 * For creating sets, there are functions setOf() and mutableSetOf().
 * A readOnly view of a mutableSet can be obtained by casting it to
 * Set.
 */

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")
fun addIssue(uniqueDesc: String): Boolean{
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String{
    return if(isAdded) "Registered Correctly." else "marked as duplicate and rejected"
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val aNewIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $aNewIssueAlreadyIn ${getStatusLog(addIssue(aNewIssueAlreadyIn))}")
}