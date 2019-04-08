package com.shawonarefin.collections.list

val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers

fun addSudoers(newUser: Int){
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int>{
    return sudoers
}

fun main() {
    addSudoers(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Some useful information on user ${i}")
    }


}




