package sas3.KotlinInAction.Ch02.FizzBuzz

fun fizzBuzz(number: Int) = when{
    ((number%15)==0) -> "FizzBuzz"
    ((number%5)==0) -> "Buzz"
    ((number%5)==0) -> "Fizz"
    else -> "${number}"
}

