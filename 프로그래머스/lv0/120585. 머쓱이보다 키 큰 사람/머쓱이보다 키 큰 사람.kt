class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        for(hei in array)
        {
            if(hei > height) answer++
        }
        return answer
    }
}