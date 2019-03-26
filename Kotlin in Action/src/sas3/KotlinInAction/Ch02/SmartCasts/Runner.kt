package sas3.KotlinInAction.Ch02.SmartCasts

fun main(args: Array<String>) {
    println(eval(Sum(Num(4),Sum(Num(2),Num(1)))))
    println(refactoredEval(Sum(Num(4),Sum(Num(2),Num(1)))))
    println(refactoredEvalUsingWhen(Sum(Num(4),Sum(Num(2),Num(1)))))
}