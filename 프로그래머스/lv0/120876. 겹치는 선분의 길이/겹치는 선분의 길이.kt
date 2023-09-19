class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer = 0
        val count = IntArray(200) { 0 }

            for (line in lines) {
                for (i in line[0] until line[1]) {
                    count[i + 100] += 1
                }
            }

            answer += count.count { it == 2 }
            answer += count.count { it == 3 }

            return answer
    }
}