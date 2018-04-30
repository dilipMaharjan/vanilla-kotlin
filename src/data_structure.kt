fun main(args: Array<String>) {

    var array = arrayOf(1, 2, "John")
    array[1] = 4
    var subArray = array.copyOfRange(0, 1)
    var sqArray = Array(5, { x -> x * x })
    var intArray: Array<Int> = arrayOf(1, 2, 3, 4)

    var aToZ = "C".."Z"
    var fiveToOne = 5.downTo(1).step(2)
    var revFiveToOne = fiveToOne.reversed()


    println(array[2])
    println("Length: ${array.size}")
    println("Contains: ${array.contains(4)}")
    println(array[0].equals(subArray.first()))
    println(sqArray[4])
    println(intArray[2])
    println("D" in aToZ)
    println(fiveToOne.first())
    println(4 in fiveToOne)
    for (x in revFiveToOne) {
        print(x)
    }

}