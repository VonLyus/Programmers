class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        val answer = Array(num_list.size / n) { IntArray(n) }
        var numCheck : Int = 0
        var changeNum : Int = 0
        
        for (i in num_list) {
            answer[changeNum][numCheck] = i
            numCheck++
            if (numCheck == n) {
                numCheck = 0
                changeNum++
            }
        }
        
        return answer
    }
}