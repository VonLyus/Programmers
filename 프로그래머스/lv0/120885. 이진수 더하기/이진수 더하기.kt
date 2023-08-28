class Solution {
    fun solution(bin1: String, bin2: String): String {
        
        var answer: String = ""
        var carry: Int = 0
        var i = bin1.length - 1
        var j = bin2.length - 1

        while (i >= 0 || j >= 0 || carry > 0) {
            val num1 = if (i >= 0) bin1[i--] - '0' else 0
            val num2 = if (j >= 0) bin2[j--] - '0' else 0
            val sum = num1 + num2 + carry
            answer = (sum % 2).toString() + answer
            carry = sum / 2
        }
        
        
        return answer
        
    }
}