class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd_sum: String = ""
        var even_sum: String =""
        for (i in num_list){
            
            if(i % 2 == 0){
                even_sum += i.toString()
            }
            
            else{
                odd_sum += i.toString()
            }
            
        }
        answer = even_sum.toInt() + odd_sum.toInt()
        return answer
    }
}