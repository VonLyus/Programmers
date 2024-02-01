class Solution {
    fun solution(n: Int): Long {
        if (n <= 2) {
            return n.toLong()
        }

        val mod = 1234567
        val dp = IntArray(n + 1)

        dp[1] = 1
        dp[2] = 2

        for (i in 3..n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod
        }

        return dp[n].toLong()
    }
}