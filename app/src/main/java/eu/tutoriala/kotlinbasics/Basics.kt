package eu.tutoriala.kotlinbasics

fun main(){

//    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

    val shoppingList = mutableListOf("Processor", "RAM",
        "Graphic Card RTX 3060", "SSD")

    shoppingList.add("Cooling System")
    shoppingList.remove("Graphic Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")
    println(shoppingList)
    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(2, "RAM")
    println(shoppingList)
    println(shoppingList[2])

    shoppingList[4] = "Graphic Card RX 7800XT"
    println(shoppingList)
    shoppingList.set(1, "Water Cooling")
    println(shoppingList)

    val hasRam = shoppingList.contains("RAM")
    if(hasRam){
        println("Has RAM in the list")
    }else{
        println("No RAM in the list")
    }

    for(item in shoppingList){
        println(item)
    }
}