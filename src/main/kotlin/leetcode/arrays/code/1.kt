package dev.folomkin.leetcode.arrays.code


fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val target = 5
    val res = twoSum(array, target)
    println(res)
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (i in nums.indices) {
        val complement = target - nums[i]
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[nums[i]] = i
    }
    return intArrayOf()
}
