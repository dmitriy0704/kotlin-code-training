package dev.folomkin.leetcode.arrays.code


fun main() {

    val array = intArrayOf(3, 2, 2, 3)
    println(removeElement(array, 3))

}

fun removeElement(nums: IntArray, k: Int): Int {
    var i = 0

    for (j in nums.indices) {
        if (nums[j] != k) {
            nums[i] = nums[j]
            i++
        }
    }
    return i
}