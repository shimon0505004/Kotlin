package com.shawonarefin.collections.list

/**
 * A map is a collection of key/value pairs, where each key is unique.
 * Key is used to retrieve the corresponding value. For creating maps,
 * there are functions mapOf() and mutableMapOf().
 * A readonly view of a mutable map can be obtained by casting it to map.
 */

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 200, 3 to 300)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int){
    if(EZPassAccounts.containsKey(accountId)){
        println("Updating ${accountId} ...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    }else{
        println("Error: Trying to update a non-existing account(id: $accountId)")
    }
}

fun accountsReport(){
    println("EZ-Pass report:")
    EZPassReport.forEach{                                                               // 5
            kvPair -> println("ID ${kvPair.key}: credit ${kvPair.value}")
    }
}

fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(2)
    updatePointsCredit(3)
    accountsReport()
}