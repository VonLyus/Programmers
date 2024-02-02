class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        
        var typeMap = hashMapOf<String, MutableList<String>>()
        
        clothes.forEach { (name, type) ->
            if (typeMap[type] == null) {
                typeMap[type] = mutableListOf(name)
            } else {
                typeMap[type]?.add(name)
            }
        }
        
        typeMap.values.forEach { typeList ->
            answer *= (typeList.size + 1)
        }
        
        
        return answer - 1
    }
}