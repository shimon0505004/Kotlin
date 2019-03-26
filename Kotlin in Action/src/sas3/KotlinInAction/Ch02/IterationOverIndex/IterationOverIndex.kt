package sas3.KotlinInAction.Ch02.IterationOverIndex


fun iterationOverIndex() {
    val list = arrayListOf("10","11","1001")

    /**
     * iterated over a collection while keeping track of the
     * index. We dont need to create seperate variable to store
     * the index and increment it by hand.
     */
    for((index, element) in list.withIndex()){
        println("${index} : ${element}")
    }
}

fun isLetter(c: Char) = c in 'a' .. 'z' || c in 'A' .. 'Z'
fun isNotDigit(c: Char) = c !in '0' .. '9'

fun main(args: Array<String>) {
    iterationOverIndex()
    println(isLetter('q'))
    println(isNotDigit('x'))
}