package classes

class Hello {

    var name: String = "Dilip"
    var age: Int = 28
    fun printNameAndAge() {
        println("name: $name age:$age")
    }

    fun printList() {
        var list = listOf<Int>(5,3,4,5,6,78)
        for (l in list) {
            println(l)
        }
    }
    fun printArray() {
        var array = arrayOf(1, 2, 3, "Hello", "hi", "what")
        for (a in array) {
            println(a)
        }
        val a = 4
        when (a) {
            5 -> println("swtich" + a)
            else ->
                println("Next Number")
        }

        var range = 1..5
        for (i in range) {
            println(i)
        }
        var reverse = 5 downTo 1
        for (i in reverse.reversed()) {
            println(i)
        }
    }


}