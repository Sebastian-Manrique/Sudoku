var randomNum = 0
val availableNumbers = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
const val col = 9
const val row = 9
val board = MutableList(col) { MutableList(row) { 0 } }

fun main() {
    generateRandomNumbers()
}

fun generateRandomNumbers() {
    for (row in 0..board.size - 1) {
        for (col in 0..board.size - 1) {

            isAvailableNumbersEmpty()

            randomNum = availableNumbers.random()
            //  println("Random number is $randomNum is repeated")
            isRepeated(randomNum, row, col)

        }
    }

    println("\nFinal board: ${board.size}")
    for (row in 0..board.size - 1) {
        if (row % 3 == 0) {
            println()
        }
        for (col in 0..board.size - 1) {
            if (col % 3 == 0 && col != 0) {
                print("   ")
            }
            print("[ ${board[row][col]} ]")
        }
        println()
    }
}

fun isRepeated(randomNum: Int, row: Int, col: Int) {
    var alreadyExists = false
    for (rowLoop in 0..board.size - 1) {
        for (colLoop in 0..board.size - 1) {
            //println("row: $rowLoop, col: $colLoop")
            if (board[rowLoop][colLoop] == randomNum) {
                //println("Number $randomNum is repeated")
                alreadyExists = true
                break
            }
            if (alreadyExists) break
        }
    }

    if (alreadyExists) {
        isAvailableNumbersEmpty()
        var isRepeatedNow = true
        var usagePerCall = 0
        do {
            val anotherRandomNum = availableNumbers.random()
            //println("New random number generated: $anotherRandomNum")
            if (board[row][col] == anotherRandomNum) {
                // println("Number $anotherRandomNum is repeated")
            } else {
                isRepeatedNow = false
                addNumberToTheBoard(randomNum, row, col, board, availableNumbers)
            }
        } while (isRepeatedNow)

    } else {
        // The numbers is not repeated, adding the number
        addNumberToTheBoard(randomNum, row, col, board, availableNumbers)
    }
}

fun addNumbersToAvailableNumbers() {
    for (numbers in 0..8) {
        availableNumbers.add(numbers + 1)
    }
}

fun addNumberToTheBoard(
    num: Int,
    row: Int,
    col: Int,
    board: MutableList<MutableList<Int>>,
    availableNumbers: MutableList<Int>
) {
    println("row: $row, col: $col, num: $randomNum")
    board[row][col] = num
    availableNumbers.remove(num)
}

fun isAvailableNumbersEmpty() {
    if (availableNumbers.isEmpty()) {
        addNumbersToAvailableNumbers()
    } else {
        // Do nothing
    }
}