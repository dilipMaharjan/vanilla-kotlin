fun main(args: Array<String>) {
    val animal = Animal("John", 4.11, 50.00)
    animal.getInfo()
    val dog = Dog("Tommy", 2.2, 10.00, "Saul")
    dog.getInfo()
}

open class Animal(val name: String, var height: Double, var weight: Double) {
    init {
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)) {
            "Animal name can't contain number"
        }
        require(height > 0) { "Height must be greater than 0" }
        require(weight > 0) { "Weight must be greater than 0" }
    }

    open fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight kgs")
    }
}

class Dog(name: String, height: Double, weight: Double, var owner: String) : Animal(name, height, weight) {
    override fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight kgs owned by $owner")
    }
}