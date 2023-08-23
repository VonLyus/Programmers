class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = 0
        var numStr = num.toString()
        answer = if(numStr.indexOf(k.toString()) != -1){
            numStr.indexOf(k.toString()) + 1
        }else{
            -1
        }
        return answer
    }
}