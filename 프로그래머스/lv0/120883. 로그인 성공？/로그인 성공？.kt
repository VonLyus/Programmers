class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = "fail" 
        
        for (i in 0 until db.size) { 
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    answer = "login"
                    break
                } else {
                    answer = "wrong pw"
                    break
                }
            }
        }
        
        return answer
    }
}