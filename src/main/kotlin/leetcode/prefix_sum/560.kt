package dev.folomkin.leetcode.prefix_sum

class Code {
}

fun main() {
    val nums = intArrayOf(1, 2, 3)
    val k = 3
    val res = subarraySum560(nums, k)
    println(res)
}

fun subarraySum560(nums: IntArray, k: Int): Int {
    var count = 0
    var currentSum = 0

    val prefixSumCount = mutableMapOf<Int, Int>()
    prefixSumCount[0] =1

    for (num in nums) {
        currentSum += num

        val target = currentSum - k
        count += prefixSumCount[target] ?: 0
        prefixSumCount[currentSum] = prefixSumCount.getOrDefault(currentSum, 0) + 1
    }

    return count
}