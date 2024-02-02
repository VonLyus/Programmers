class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        
        var index1 : Int = 0
        var index2 : Int = 0
        
        for (goals in goal){
            if(index1 < cards1.size && cards1[index1] == goals){
                index1 ++
            }else if(index2 < cards2.size && cards2[index2] == goals){
                index2 ++
            }else{
                return "No"
            }
        }
        
        return "Yes"
    }
}