package com.shawonarefin.kotlinlang.delegationpattern

interface SoundBehavior{
    fun makeSound()
}

class ScreamBehavior(val n: String): SoundBehavior{
    override fun makeSound() = println("${n.toUpperCase()} !!!")
}

class RockAndRollBehavior(val n: String): SoundBehavior{
    override fun makeSound() = println("I'm the king of rock 'N' roll: $n")
}

class TomAraya(n: String): SoundBehavior by ScreamBehavior(n)
class ElvisPresley(n: String): SoundBehavior by RockAndRollBehavior(n)

fun main() {
    val tomAraya = TomAraya("Trash Metal")
    tomAraya.makeSound()
    val elvisPresley = ElvisPresley("Dancing to the Jailhouse Rock.")
    elvisPresley.makeSound()
}