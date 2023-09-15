class Solution {
    fun solution(numbers: String): Long {
        var answer: Long = 0
        var currentNumber = ""
        
        for (char in numbers) {
            currentNumber += char
            when (currentNumber) {
                "zero" -> {
                    answer = answer * 10 + 0
                    currentNumber = ""
                }
                "one" -> {
                    answer = answer * 10 + 1
                    currentNumber = ""
                }
                "two" -> {
                    answer = answer * 10 + 2
                    currentNumber = ""
                }
                "three" -> {
                    answer = answer * 10 + 3
                    currentNumber = ""
                }
                "four" -> {
                    answer = answer * 10 + 4
                    currentNumber = ""
                }
                "five" -> {
                    answer = answer * 10 + 5
                    currentNumber = ""
                }
                "six" -> {
                    answer = answer * 10 + 6
                    currentNumber = ""
                }
                "seven" -> {
                    answer = answer * 10 + 7
                    currentNumber = ""
                }
                "eight" -> {
                    answer = answer * 10 + 8
                    currentNumber = ""
                }
                "nine" -> {
                    answer = answer * 10 + 9
                    currentNumber = ""
                }
            }
        }
    
        return answer
    }
}