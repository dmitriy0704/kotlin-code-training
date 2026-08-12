package dev.folomkin.leetcode.binary_search


fun main() {
    val arr = intArrayOf(-1, 0, 3, 5, 9, 12)
    println(guessNumber(10))
}

fun guessNumber(n: Int): Int {


    for (i in 1..n){
        val pick = 0
        when {
            pick == i -> return 0
            pick < i -> return 1
            pick > i -> return -1

        }
    }
    return -1
}