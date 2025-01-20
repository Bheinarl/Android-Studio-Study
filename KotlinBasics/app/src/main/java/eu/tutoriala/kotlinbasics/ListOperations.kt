package eu.tutoriala.kotlinbasics

fun main(){

    val fruitsList = mutableListOf("apple", "banana",
        "orange", "coconut", "pear")
    println(fruitsList)
    fruitsList.add("kiwi")
    println(fruitsList)
    fruitsList.remove("pear")
    println(fruitsList)

}