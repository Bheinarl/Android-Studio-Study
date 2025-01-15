package eu.tutoriala.kotlinbasics

class Dog (val name: String, val breed:String, val age:Int){

    init {
        bark(name)
    }

    fun bark(name:String){
        println("$name says Woof Woof")
    }
}