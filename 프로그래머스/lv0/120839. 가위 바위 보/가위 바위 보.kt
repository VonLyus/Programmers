class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        var judgeRsp = rsp.toCharArray()
        for (i in judgeRsp){
            if (i == '2'){
                answer += "0" 
            }else if (i == '0'){
                answer += "5" 
            }else{
                answer += "2" 
            }
        }
        return answer
    }
}