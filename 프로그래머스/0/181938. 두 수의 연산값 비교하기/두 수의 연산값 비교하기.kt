import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        answer = max("$a$b".toInt(),2*a*b)
        return answer
    }
}