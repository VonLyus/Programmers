class Solution {
    fun solution(my_string: String): IntArray {
        var answer : IntArray = intArrayOf()
        var judge = my_string.toCharArray()
        var setting : IntArray = intArrayOf()
        
        for (num in judge) {
            when (num) {
                in '0'..'9' -> setting = setting.plus(num.toString().toInt())
            }
        }
        
        answer = setting.sorted().toIntArray()
        return answer
    }
}