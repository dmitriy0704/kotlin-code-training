package dev.folomkin.leetcode.arrays.code


fun main(){
    val arr = intArrayOf(1,2,3,4,5)
    val target = 5
    println(searchInsert(arr, target))
}

fun searchInsert(nums: IntArray, target: Int): Int {

    for (i in nums.indices){
        if (nums[i] == target){
            return i
        }
    }
    return -1
}