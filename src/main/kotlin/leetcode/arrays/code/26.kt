package dev.folomkin.leetcode.arrays.code


fun main() {

    val array = intArrayOf(0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5)
    println(removeDuplicates(array))

}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var i = 0
    for (j in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            i++
            nums[i] = nums[j]
        }
    }
    return i + 1
}