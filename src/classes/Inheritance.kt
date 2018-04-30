package classes

open class Parent {
    init {
        println("Parent")
    }
}

class Child:Parent(){
    init {
        println("Child")
    }
}

fun main(args: Array<String>) {
    Child()
}