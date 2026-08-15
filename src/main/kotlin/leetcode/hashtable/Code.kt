package dev.folomkin.leetcode.hashtable

fun main() {
    val intArray = intArrayOf(2,2,1)
    val res = singleNumber(intArray)
    println(res)
}

fun singleNumber(nums: IntArray): Int {
    var res = 0
    for (num in nums) {
        res = res xor num
        println(res)
    }
    return res
}