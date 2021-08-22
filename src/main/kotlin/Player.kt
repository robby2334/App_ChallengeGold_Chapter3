import app.finals

class Player {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Player().battleSuit()
        }
    }

    internal fun battleSuit() {
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
            println("first choice of player : ")
            val firstUser = readLine()?.toInt() ?: 0
            println("choice of second player : ")
            val secondUser = readLine()?.toInt() ?: 0
            println("${finals(firstUser, secondUser)}")

        } catch (e: Exception) {

            println("${branching()}")

        }

    }

    fun branching() {

        println("the choice you entered is wrong")
    }
}

