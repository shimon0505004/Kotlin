package sas3.KotlinInAction.Ch02.SmartCasts

fun eval(expression : Expr): Int{
    if(expression is Num){
        val n = expression as Num       //This explicit cast to Num is redundant
        return n.value
    }
    if(expression is Sum){
        /**
         * The variable expression is smart-cast.
         * Here, once we check the variable "expression" has Sum type,
         * the compiler interprets it as a Num variable.
         * We can then access the value property of Sum without an
         * explicit cast.
         * If we needed to do it in java, we would have needed to do explicit
         * type casting.
         */
        return eval(expression.right) + eval(expression.left)
    }
    throw IllegalArgumentException("Unknown Expression")
}

fun refactoredEval(expression : Expr): Int =
        if (expression is Num){
            expression.value
        }else if(expression is Sum){
            eval(expression.right) + eval(expression.left)
        }else
            throw IllegalArgumentException("Unknown Expression")


/**
 * Used when instead of if cascade.
 */
fun refactoredEvalUsingWhen(expression : Expr): Int =
        when (expression) {
            is Num -> expression.value
            is Sum -> eval(expression.right) + eval(expression.left)
            else -> throw IllegalArgumentException("Unknown Expression")
        }

fun evalWithLogging(expression: Expr): Int = when(expression){
    is Num -> {
        println("Number : ${expression.value}")
        expression.value
    }
    is Sum -> {
        val left = evalWithLogging(expression.left)
        val right = evalWithLogging(expression.right)
        println("Sum: ${left} + ${right}")
        left + right
    }
    else -> throw IllegalArgumentException("Unknown Expression")
}