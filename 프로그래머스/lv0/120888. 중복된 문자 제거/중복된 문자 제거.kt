class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var seenChars = mutableSetOf<Char>() 
        for (char in my_string) {
            if (!seenChars.contains(char)) {
                seenChars.add(char)
                answer += char
            }
        }
        
        return answer
    }
}