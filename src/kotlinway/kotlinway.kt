package kotlinway



/**
 *
 *   Created by Dilip Maharjan on 16-05-2018
 */

fun main(args:Array<String>){
println(returns2ifaisnull())
    println(parameterizedDefaultValue())
    println(parameterizedDefaultValue(3,7))
    println(parameterizedDefaultValue(a=15))
    println(parameterizedDefaultValue(b=15))
}

fun returns2ifaisnull():Int?{
    var a:Int? =null
    return a?:2
}
fun parameterizedDefaultValue(a:Int=5,b:Int=2):Int{
    return a+b
}