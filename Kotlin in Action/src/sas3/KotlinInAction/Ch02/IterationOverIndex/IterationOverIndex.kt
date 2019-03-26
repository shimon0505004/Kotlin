package sas3.KotlinInAction.Ch02.IterationOverIndex


fun iterationOverIndex() {

    val list = arrayListOf("10","11","1001")

    for((index, element) in list.withIndex()){
        println("${index} : ${element}")
    }
}


fun main(args: Array<String>) {
    iterationOverIndex()
}