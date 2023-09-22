class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        
        var boardSize: Int = 0
        
        var countBoard = Array(board.size) { IntArray(board[0].size) { 0 } }
        
        val dx = intArrayOf(-1, -1, -1, 0, 0, 1, 1, 1)
        val dy = intArrayOf(-1, 0, 1, -1, 1, -1, 0, 1)

        
        boardSize = board.size * board[0].size
        
        for(i in board.indices){
        
            for(j in board[i].indices){
                if (board[i][j] == 1){
                    countBoard[i][j] += 1
                    for (k in 0 until 8) {
                        val newI = i + dx[k]
                        val newJ = j + dy[k]
                        if (newI >= 0 && newI < board.size && newJ >= 0 && newJ < board[i].size) {
                        countBoard[newI][newJ] += 1
                        }
                    }
                }
            }
        }
        for(i in board.indices){
        
            for(j in board[i].indices){
                if(countBoard[i][j] != 0){
                    boardSize --
                }
            }
        }
        answer = boardSize
        return answer
    }
}