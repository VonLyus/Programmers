class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        
        var halfX = board[0] / 2
        var halfY = board[1] / 2
        for (i in keyinput) {
            when (i) {
                "left" -> {
                    answer[0] = answer[0] - 1
                    if (answer[0] < -halfX) answer[0] = -halfX
                }
                "right" -> {
                    answer[0] = answer[0] + 1
                    if (answer[0] > halfX) answer[0] = halfX
                }
                "up" -> {
                    answer[1] = answer[1] + 1
                    if (answer[1] > halfY) answer[1] = halfY
                }
                "down" -> {
                    answer[1] = answer[1] - 1
                    if (answer[1] < -halfY) answer[1] = -halfY
                }
            }
        }
        return answer
    }
}