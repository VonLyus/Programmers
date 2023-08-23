class Solution {
    fun solution(my_string: String): String {
        
        var answer: String = ""
    
        for (char in my_string) {
            if (char.isUpperCase()) {
                answer += char.toLowerCase()
            } else {
                answer += char.toUpperCase()
            }
        }
        return answer
    }
}