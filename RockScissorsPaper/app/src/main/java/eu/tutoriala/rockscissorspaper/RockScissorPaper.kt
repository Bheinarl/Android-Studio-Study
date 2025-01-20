package eu.tutoriala.rockscissorspaper

fun main(){

    var computerChoice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice")
    playerChoice = readln().lowercase()
    while (playerChoice != "rock" && playerChoice != "paper" && playerChoice != "scissors"){
        println("Choice Rock, Paper or Scissors")
        playerChoice = readln().lowercase()
    }

    val randomNumber = (1 .. 3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "rock"
        }
        2 -> {
            computerChoice = "paper"
        }
        3 -> {
            computerChoice = "scissors"
        }
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"

        playerChoice == "rock" && computerChoice == "scissor" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissor" && computerChoice == "paper" -> "Player"

        else -> "Computer"
    }

    if(winner == "Tie"){
        println("It's a tie")

    }else{
        println("$winner won!")
    }

}