class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0
        if(a != b && a != c && b != c){
            answer = a + b + c
        }else if((a == b && a != c)||(b == c && a != c)||(a == c && b !=c)){
            answer = (a+b+c)*( a*a + b*b + c*c )
        }else{
            answer = (a+b+c)*( a*a + b*b + c*c )*(a*a*a + b*b*b + c*c*c)
        }
        return answer
    }
}