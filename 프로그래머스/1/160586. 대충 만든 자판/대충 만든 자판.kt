class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer = IntArray(targets.size)

        for ((index, target) in targets.withIndex()) {
            var keyCount = 0

            for (char in target) {
                var minPressCount: Int = keymap
                    .map { it.indexOf(char) }
                    .filter { it != -1 } 
                    .minOrNull() ?: -1 

                if (minPressCount == -1) {
                    keyCount = -1
                    break
                }

                keyCount += minPressCount + 1 
            }

            answer[index] = keyCount
        }
        return answer
    }
}