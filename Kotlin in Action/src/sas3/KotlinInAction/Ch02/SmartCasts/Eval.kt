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