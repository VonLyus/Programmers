class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        var ch_str1 = str1.toCharArray()
        var ch_str2 = str2.toCharArray()
        
        for(i in 0 until str1.length){
            answer += ch_str1[i]
            answer += ch_str2[i]
        }
        return answer
    }
}