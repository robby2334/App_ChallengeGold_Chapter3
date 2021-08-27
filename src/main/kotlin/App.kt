import utlis.MatchResults
import kotlin.system.exitProcess

class App {
    private val matchResults = MatchResults()

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().start()
        }
    }

    fun start() {
        battleSuit()
    }

    private fun battleSuit() {
        println(
            """
            =======================================
                   GAME SUIT TERMINAL VERSION
            =======================================            
            1. Scissors
            2. Stone
            3. Paper
            =======================================
            ENTER OPTIONS ? (1/2/3)
            =======================================
        """.trimIndent()
        )
        try {

            //take input user
            println("Enter the number one player choice : ")
            val firstUser = readLine()?.toInt() ?: 0
            when (firstUser) {
                1 -> println("Scissors\n")
                2 -> println("Stone\n")
                3 -> println("Paper\n")
            }
            println("enter the choice of player number two : ")
            val secondUser = readLine()?.toInt() ?: 0
            when (secondUser) {
                1 -> println("Scissors\n")
                2 -> println("Stone\n")
                3 -> println("Paper\n")
            }
            println(matchResults.finals(firstUser, secondUser))

        } catch (e: Exception) {

            println("${wrongInput()}")

        } finally {
            aksToPlayAgain()
        }

    }

    private fun aksToPlayAgain() {
        println(
            """
            play again ? (Y/N)
        """.trimIndent()
        )
        if (readLine().equals("y", ignoreCase = true)) {
            battleSuit()
        } else {
            exitProcess(0)
        }

    }

    internal fun wrongInput() {

        println("the choice you entered is wrong, please choose numbers 1 to 3")
    }
}

