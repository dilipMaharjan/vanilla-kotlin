fun main(args: Array<String>) {
    val (three, four) = returnTwoValues(2)
    println("$three , $four")
    variableArgs(1, 2, 3, 4, 5, 6)
    higherOrderfun()
}

fun returnTwoValues(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}

fun variableArgs(vararg nums: Int) {
    for (n in nums) {
        print("$n \t")
    }
}

/**
 * Higher order functions are those which accepts or returns another function
 */
fun higherOrderfun() {
    val numList = 1..20
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> print("$n\t") }
}