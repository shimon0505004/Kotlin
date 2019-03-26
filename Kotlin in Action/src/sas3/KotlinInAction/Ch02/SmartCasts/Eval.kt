package sas3.KotlinInAction.Ch02.SmartCasts

fun eval(expression : Expr): Int{
    if(expression is Num){
        val n = expression as Num
        return n.value
    }
    if(expression is Sum){
        return eval(expression.right) + eval(expression.left)
    }
    throw IllegalArgumentException("Unknown Expression")
}