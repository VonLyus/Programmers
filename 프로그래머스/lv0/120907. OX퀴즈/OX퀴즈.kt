class Solution {
    fun solution(quiz: Array<String>): List<String> {
        val answer = mutableListOf<String>()

        for (i in 0 until quiz.size) {
            val judge = quiz[i].split(" ")
            val operand1 = judge[0].toInt()
            val operator = judge[1]
            val operand2 = judge[2].toInt()
            val result = judge[4].toInt()

            when (operator) {
                "+" -> {
                    if (operand1 + operand2 == result) {
                        answer.add("O")
                    } else {
                        answer.add("X")
                    }
                }
                "*" -> {
                    if (operand1 * operand2 == result) {
                        answer.add("O")
                    } else {
                        answer.add("X")
                    }
                }
                "/" -> {
                    if (operand1 / operand2 == result) {
                        answer.add("O")
                    } else {
                        answer.add("X")
                    }
                }
                "-" -> {
                    if (operand1 - operand2 == result) {
                        answer.add("O")
                    } else {
                        answer.add("X")
                    }
                }
                else -> answer.add("X")
            }
        }

        return answer
    }
}