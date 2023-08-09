class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var settingNum: IntArray = numbers.sortedArrayDescending()
        answer = settingNum[0] * settingNum[1]
        
        return answer
    }
}