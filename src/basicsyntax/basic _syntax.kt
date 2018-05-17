/**
 * package is defined with <package> keyword and the name of the package
 * package declaration should be in the top of the file
 *
 *
 * function is defined with <fun> keyword followed by function name
 * function can have parameter with data type
 * unlike java data type is suffixed in variables and return type
 *
 * function can be written as with expression body and inferred return type
 *
 * <Unit> keyword is used to refer no data type
 *
 * <Unit> keyword can be ommited
 *
 */
package basicsyntax

fun add( num1:Int,num2:Int):Int{
    return num1+num2
}

fun subtract(num1: Int,num2: Int):Int=num1-num2

fun funWithOutReturnType():Unit= println("funtion without return type")

fun funWithOmittedUnit()= println("funtion without <Unit> return type")

fun conditionalsAsExpression(a:Int,b:Int)=if(a>b) a else b
fun funWithDefaultValues(a:Int=5,b:Int){
    println("The multiplication of $a and $b is : ${a*b}")
}
fun main(args:Array<String>){

    /**
     * <val> keyword is used to represent immutable variables i.e final in Java
     * val variables cannot be reassigned value
     *
     */
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3

//Such reassignment is not allowed on val variable    b=5

    println(add(2,3))

    println(subtract(5,3))

    funWithOutReturnType()

    funWithOmittedUnit()
    println(conditionalsAsExpression(5,4))
    funWithDefaultValues(2,4)
    funWithDefaultValues(b=5)
    println(listOf<Int>(1,2,4,4,5,6,7).filter { 10<=it*2 })

    val map=mapOf(1 to "one",2 to "two")

    for ((k,v) in map){
        println("$k : $v ")
    }
    println(map?.size) //print size of map if not null
    println(map?.let {
       map.filter { it.key==1 }
    })
}