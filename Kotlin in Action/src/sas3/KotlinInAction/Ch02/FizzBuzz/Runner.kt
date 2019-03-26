package sas3.KotlinInAction.Ch02.FizzBuzz

fun main(args: Array<String>) {
    /**
     * .. operator in kotlin creates a closed range between two number,
     * such a closed range is called a progression.
     */
    for(number in 1..100){
        println(fizzBuzz(number))
    }

    println("****-----***----****")
    /**
     * iterating over a range with a step
     */
    for(number in 100 downTo 1 step 2){
        println(fizzBuzz(number))
    }

    println("****-----***----****")
    for(number in 1 .. 100 step 2){
        println(fizzBuzz(number))
    }


    println("****-----***----****")
    for(number in 50 until 100 step 2){
        println(fizzBuzz(number))
    }

}