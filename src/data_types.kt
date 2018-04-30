package datatype

/**
 * It is not required to specify the data type in Kotlin but can be
 *
 * var defines mutable variables
 *
 * val defines immutable variables
 *
 */
fun main(args: Array<String>) {

    var smallShort:Short = Short.MIN_VALUE
    var bigShort:Short= Short.MAX_VALUE

    var smallByte:Byte = Byte.MIN_VALUE
    var bigByte:Byte= Byte.MAX_VALUE

    var smallInt:Int =Int.MIN_VALUE
    var bigInt:Int= Int.MAX_VALUE

    var smallLong:Long= Long.MIN_VALUE
    var bigLong:Long= Long.MAX_VALUE

    var smallDouble :Double= Double.MIN_VALUE
    var bigDouble :Double= Double.MAX_VALUE

    var smallFloat:Float= Float.MIN_VALUE
    var bigFloat:Float= Float.MAX_VALUE

    println("Byte: $smallByte , $bigByte")
    println("Short: $smallShort , $bigShort")
    println("Int: $smallInt , $bigInt")
    println("Long: $smallLong , $bigLong")
    println("Double: $smallDouble , $bigDouble")
    println("Float: $smallFloat , $bigFloat")
    println(true is Boolean)
    println('A' is Char)

    /**
     * Casting
     */

    println("3.14 to int :${3.14.toInt()}")
    println("A to int :${'A'.toInt()}")
    println("65 to Char :${65.toChar()}")

    val name="Dilip"
    var shortString:String="This is short string"
    var longStr="""This is a long
        string
        asdfasdfa
        adsfa"""
    println(name)
    println(longStr)
    println("String length ${name.length}")
    println("Compare stirng ${shortString.equals(longStr)}")
    println("Compare A to B : ${"A".compareTo("B")}")
    println("2nd index: ${shortString.get(2)}")
    println("2nd index: ${shortString[2]}")
    println("Index 2-7 : ${shortString.subSequence(4,shortString.length)}")
    println("Contains : ${longStr.contains("This")}")
}