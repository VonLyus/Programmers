class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        var minX: Int = Int.MAX_VALUE
        var minY: Int = Int.MAX_VALUE
        var maxX: Int = Int.MIN_VALUE
        var maxY: Int = Int.MIN_VALUE
        for( i in dots )
        {
            minX = minOf(i[0], minX)
            minY = minOf(i[1], minY)
            maxX = maxOf(i[0], maxX)
            maxY = maxOf(i[1], maxY)
            answer = (maxX-minX)*(maxY-minY)
        }
        return answer
    }
}