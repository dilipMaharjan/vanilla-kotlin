import classes.Hello

fun main(args: Array<String>) {
    println("Hello Kotlin")
    printArray()
    var hello=Hello()
    hello.printNameAndAge()
}

fun printArray() {
    var array = arrayOf(1, 2, 3, "Hello", "hi", "what")
    for (a in array) {
        println(a)
    }

    var range = 1..5
    for (i in range) {
        println(i)
    }
    var reverse=5 downTo 1
    for (i in reverse.reversed()){
        println(i)
    }
}

