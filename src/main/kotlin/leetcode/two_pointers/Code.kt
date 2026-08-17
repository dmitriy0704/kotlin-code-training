package dev.folomkin.leetcode.two_pointers


fun main() {
    val nums = intArrayOf(0,1,0,3,12)
    println(moveZeroes(nums))
}

fun moveZeroes(nums: IntArray): Unit {
    var i = 0
    for(j in nums.indices){
        if(nums[j] != 0){
            nums[i] == nums[j]
            i++
        }
    }
}