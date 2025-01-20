package eu.tutoriala.kotlinbasics

fun main() {

    println("Type Number")

    var inputString = readln()
    var inputNumber = inputString.toInt()

    val multiplier = 5
    var answer = multiplier * inputNumber
    println("$answer")
}