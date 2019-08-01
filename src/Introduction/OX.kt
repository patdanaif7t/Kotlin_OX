
var board = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9")

var turn = "X"
var winner: String? = null
var count: Int = 0
fun main() {
    var numInput: Int
    println("Welcome to OX Game")

    printBoard()
    println("X จะเริ่มเล่นก่อน โปรดป้อนตำแหน่งที่จะวาง X :")
    while (winner == null) {
        try {
            numInput = Integer.valueOf(readLine())
            if (!(numInput > 0 && numInput <= 9)) {
                println("ป้อนเลข 1-9:")
                continue
            }
        } catch (e: Throwable) {
            println("ป้อนเลข 1-9:")
            continue
        }

        if (board[numInput - 1] == numInput.toString()) {
            board[numInput - 1] = turn
            if (turn == "X") {
                turn = "O"
            } else {
                turn = "X"
            }
            printBoard()
            winner = checkWinner()
        } else {
            println("เลขซ้ำ :")
            continue
        }
    }
    if (winner.equals("draw")) {
        println("เสมอ")

    } else {
        println("ยินดีด้วย! $winner ชนะ ")
    }
}

internal fun checkWinner(): String? {
    for (a in 0..7) {
        var line: String? = null
        when (a) {
            0 -> line = board[0] + board[1] + board[2]
            1 -> line = board[3] + board[4] + board[5]
            2 -> line = board[6] + board[7] + board[8]
            3 -> line = board[0] + board[3] + board[6]
            4 -> line = board[1] + board[4] + board[7]
            5 -> line = board[2] + board[5] + board[8]
            6 -> line = board[0] + board[4] + board[8]
            7 -> line = board[2] + board[4] + board[6]
        }

        if (line == "XXX") {
            return "X"
        } else if (line == "OOO") {
            return "O"
        }
    }
    count+=1
    println(count)
    if (count>=9) {
        return "draw"
    }
    println("$turn :")
    return null
}

internal fun printBoard() {
//    println("/---|---|---\\")
    println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |")
    println("|-----------|")
    println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |")
    println("|-----------|")
    println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |")
//    println("/---|---|---\\")
}
