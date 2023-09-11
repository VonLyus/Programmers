class Solution {
    fun solution(num: Int, total: Int): IntArray {
        val answer = IntArray(num)

        val center = total / num

        val offset = if (num % 2 == 0) num / 2 - 1 else num / 2

        for (i in 0 until num) {
            answer[i] = center - offset + i
        }

        return answer
    }
}
