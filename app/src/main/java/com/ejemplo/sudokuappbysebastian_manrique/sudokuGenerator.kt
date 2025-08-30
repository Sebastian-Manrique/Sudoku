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
            if (col % 3 == 0 && col != 0){
                print("   ")
            }
            print("[ ${board[row][col]} ]")
        }
        println()
    }
}

fun isRepeated(randomNum: Int, row: Int, col: Int) {
    for (rowLoop in 0..board.size - 1) {
        for (colLoop in 0..board.size - 1) {
            println("row: $rowLoop, col: $colLoop")
            if (board[rowLoop][colLoop] == randomNum) {
                //println("Number $randomNum is repeated")
                if (availableNumbers.isEmpty()) {
                    println("All numbers are used up.")
                    addNumbers()
                } else {
                    var isRepeatedNow = true
                    do {
                        val anotherRandomNum = availableNumbers.random()
                        //      println("New random number generated: $anotherRandomNum")
                        if (board[row][col] == anotherRandomNum) {
                            //  println("Number $anotherRandomNum is repeated")
                        } else {
                            addNumber(randomNum, row, col, board, availableNumbers)
                            isRepeatedNow = false
                        }
                    } while (isRepeatedNow)
                }
            } else {
                //println("Number $randomNum is not repeated")
                addNumber(randomNum, row, col, board, availableNumbers)
            }
        }
    }
}

fun addNumbers() {
    for (numbers in 0..8) {
        availableNumbers.add(numbers + 1)
    }
}

fun addNumber(
    num: Int,
    row: Int,
    col: Int,
    board: MutableList<MutableList<Int>>,
    availableNumbers: MutableList<Int>
) {
    println("Random number generated: $randomNum at row $row, col $col")
    board[row][col] = num
    availableNumbers.remove(num)
}
