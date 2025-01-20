package eu.tutoriala.kotlinbasics

fun main() {
    var age = 0
    age = readln().toInt()

//    if (age >= 40) {
//    println("You cannot go into the club, please go home")
//    }else if (age >= 18) {
//        println("You can enter the club")
//    }else {
//        println("Age not verified. Please contact support")
//    }
//}

    if (18 <= age && age < 40) {
        print("go club")
    } else {
        print("don't go club)")
    }
}