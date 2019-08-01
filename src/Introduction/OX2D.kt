package Introduction
val arrayOX = arrayOf(
        arrayOf("-", "-", "-"),
        arrayOf("-", "-", "-"),
        arrayOf("-", "-", "-")
)

var turn = "X"
var winner: String? = null
var count: Int = 0
var numInput1: Int = 0
var numInput2: Int = 0
fun main() {
    while (true) {
        printBoard()

        try {
            numInput1 = Integer.valueOf(readLine())
            numInput2 = Integer.valueOf(readLine())
            if (numInput1 >= 0 && numInput1 <= 2) {
                if (numInput2 >= 0 && numInput2 <= 2) {
                    if (arrayOX[numInput1][numInput2] == "-") {
                        arrayOX[numInput1][numInput2] = turn
                        if (turn == "X") {
                            turn = "O"
                        } else {
                            turn = "X"
                        }
                        printBoard()
                        winner = checkWinner()

                        if (winner.equals("draw")) {
                            println("เสมอ")
                            break
                        } else if (winner.equals("O")) {
                            println("ยินดีด้วย! O ชนะ ")
                            break
                        }else if (winner.equals("X")) {
                            println("ยินดีด้วย! X ชนะ ")
                            break
                        }
                    }
                } else {
                    println("รูปแบบผิด")
                }
            } else {
                println("รูปแบบผิด")
            }
        } catch (e: Throwable) {

        }
    }
}

fun checkWinner(): String? {
    for (a in 0..7) {
        var line: String? = null
        when (a) {
            0 -> line = arrayOX[0][0] + arrayOX[0][1] + arrayOX[0][2]
            1 -> line = arrayOX[1][0] + arrayOX[1][1] + arrayOX[1][2]
            2 -> line = arrayOX[2][0] + arrayOX[2][1] + arrayOX[2][2]
            3 -> line = arrayOX[0][0] + arrayOX[1][0] + arrayOX[2][0]
            4 -> line = arrayOX[0][1] + arrayOX[1][1] + arrayOX[2][1]
            5 -> line = arrayOX[0][2] + arrayOX[1][2] + arrayOX[2][2]
            6 -> line = arrayOX[0][2] + arrayOX[1][1] + arrayOX[2][0]
            7 -> line = arrayOX[0][0] + arrayOX[1][1] + arrayOX[2][2]
        }

        if (line == "XXX") {
            return "X"
        } else if (line == "OOO") {
            return "O"
        }
    }
    count += 1
//    println(count)
    if (count >= 9) {
        return "draw"
    }
    return null
}

fun printBoard() {
    println("Welcome to Game")
    println("  0 " + "1 " + "2 ")
    println("0 " + arrayOX[0][0] + " " + arrayOX[0][1] + " " + arrayOX[0][2] + " ")
    println("1 " + arrayOX[1][0] + " " + arrayOX[1][1] + " " + arrayOX[1][2] + " ")
    println("2 " + arrayOX[2][0] + " " + arrayOX[2][1] + " " + arrayOX[2][2] + " ")
    println("$turn Turn :")
}
