package dev.folomkin.codewars

fun sum(numbers: IntArray): Int = numbers.toList().filter { it > 0 }.sum()

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, -5, 6, -7, 8, 9, 10)
    println(sum(arr))
}