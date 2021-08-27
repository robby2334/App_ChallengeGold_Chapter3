package utlis

import App

class MatchResults : InterfaceMatchResults {

    override fun finals(firstUser: Int, secondUser: Int) {


        if (firstUser == 1 && secondUser == 1) {     //player one chooses scissors,player two chooses Scissors
            showResult(2)
        } else if (firstUser == 2 && secondUser == 1) { //player one chooses stone,player two chooses Scissors
            showResult(0)
        } else if (firstUser == 3 && secondUser == 1) { //player one chooses paper,player two chooses Scissors
            showResult(1)
        } else if (firstUser == 1 && secondUser == 2) { //player one chooses scissors,player two chooses stone
            showResult(1)
        } else if (firstUser == 2 && secondUser == 2) { //player one chooses stone,player two chooses stone
            showResult(2)
        } else if (firstUser == 3 && secondUser == 2) { //player one chooses paper,player two chooses stone
            showResult(0)
        } else if (firstUser == 1 && secondUser == 3) { //player one chooses scissors,player two chooses paper
            showResult(0)
        } else if (firstUser == 2 && secondUser == 3) { //player one chooses stone,player two chooses paper
            showResult(1)
        } else if (firstUser == 3 && secondUser == 3) { //player one chooses paper,player two chooses paper
            showResult(2)
        } else print("${App().wrongInput()}")
    }


    private fun showResult(result: Int) {
        when (result) {
            0 -> {
                println(
                    """
                    ================================
                    **** player number one wins ****
                    ================================                    
                """.trimIndent().uppercase()
                )
            }
            1 -> {
                println(
                    """                    
                    ================================
                    **** player number two wins ****
                    ================================                    
                """.trimIndent().uppercase()
                )
            }
            2 -> {
                println(
                    """                    
                    ================================
                    ############# Draw #############
                    ================================
                """.trimIndent().uppercase()
                )
            }

        }

    }
}







