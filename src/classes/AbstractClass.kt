package classes


abstract class AbstractClass {
    abstract fun hello():String
    abstract fun hi():String
}

class Greetings:AbstractClass(){
    override fun hello()="Hello"

    override fun hi()="Hi"
}

fun main(args: Array<String>) {
    println(Greetings().hello())
   println(Greetings().hi())
}