import kotlin.math.pow

class Solution {
    fun solution(N: Int, number: Int): Int {
        val numbers = Array(8) { HashSet<Int>() }
        for(nCount in (1..8)) {
            val numbersIndex = nCount - 1
            numbers[numbersIndex].add(let {
                var num = N
                (1 until nCount).forEach {
                    num += N * 10.0.pow(it).toInt()
                }
                num
            })

            for(i in (1 until nCount)) {
                for(left in numbers[i-1]) {
                    for(right in numbers[(nCount - i) - 1]) {
                        numbers[numbersIndex].add(left + right)
                        numbers[numbersIndex].add(left - right)
                        numbers[numbersIndex].add(left * right)
                        if(right == 0) continue
                        numbers[numbersIndex].add(left / right)
                    }
                }
            }
            if(numbers[numbersIndex].contains(number)) return nCount
        }
        return -1
    }
}