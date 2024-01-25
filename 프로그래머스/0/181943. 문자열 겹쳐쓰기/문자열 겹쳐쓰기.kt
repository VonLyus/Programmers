class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""

        var ch_my_string = my_string.toCharArray()
        var ch_overwrite_string = overwrite_string.toCharArray()

        var count_my_string = 0
        var count_overwrite_string = 0

        for (i in ch_my_string) {
            count_my_string++
            if (s < count_my_string && count_my_string <= s + overwrite_string.length) {
                answer += ch_overwrite_string[count_overwrite_string]
                count_overwrite_string++
            } else {
                answer += i
            }
        }

        return answer
    }
}