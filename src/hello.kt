fun main(args:Array<String>){
    println("Hello Kotlin")
    printArray()
}

fun printArray(){
    var array= arrayOf(1,2,3,"Hello","hi","what")
    for (a in array){
        println(a)
    }
}