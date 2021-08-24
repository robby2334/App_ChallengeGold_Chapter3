package app

import Player

fun finals(firstUser: Int, secondUser: Int) {


    if (firstUser == 1 && secondUser == 1) {     //firstUser choose Scissors,secondUser choose Scissors
        showResult(2)
    } else if (firstUser == 2 && secondUser == 1) { //firstUser choose Stone,secondUser choose Scissors
        showResult(0)
    } else if (firstUser == 3 && secondUser == 1) { //firstUser choose Paper,secondUser choose Scissors
        showResult(1)
    } else if (firstUser == 1 && secondUser == 2) { //firstUser choose Scissors,secondUser choose Stone
        showResult(1)
    } else if (firstUser == 2 && secondUser == 2) { //firstUser choose Stone,secondUser choose Stone
        showResult(2)
    } else if (firstUser == 3 && secondUser == 2) { //firstUser choose Paper,secondUser choose Stone
        showResult(1)
    } else if (firstUser == 1 && secondUser == 3) { //firstUser choose Scissors,secondUser choose Paper
        showResult(0)
    } else if (firstUser == 2 && secondUser == 3) { //firstUser choose Stone,secondUser choose Paper
        showResult(0)
    } else if (firstUser == 3 && secondUser == 3) { //firstUser choose Scissors,secondUser choose Paper
        showResult(2)
    } else print("${Player().branching()}")
}

fun showResult(result: Int) {
    when (result) {
        0 -> {
            println("*** first player wins ****")
        }
        1 -> {
            println("*** second player wins ***")
        }
        2 -> {
            println("=== Draw ===")
        }


    }
}







