class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""
        val charArray = my_string.toCharArray()
        val dump = charArray[num1]
        charArray[num1] = charArray[num2]
        charArray[num2] = dump
        answer = String(charArray)
        return answer
    }
}