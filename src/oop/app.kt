package oop


/**
 *
 *   Created by Dilip Maharjan on ${Day}-04-2018
 */
fun main(args: Array<String>) {
    val student=Student(1,"dilip","maharjan","crazdrms")
    with(student){
        println("Id : $id")
        println("Username :  $username")
    }
}