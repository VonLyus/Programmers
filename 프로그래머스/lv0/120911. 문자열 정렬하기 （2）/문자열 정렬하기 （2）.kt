class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        var setting: String = ""
        for (char in my_string)
            {
                if(char.isUpperCase()){setting += char.toLowerCase()
                }else{setting += char}
            }
            
        answer = setting.toList().sorted().joinToString(separator = "")
        
        return answer
    }
}