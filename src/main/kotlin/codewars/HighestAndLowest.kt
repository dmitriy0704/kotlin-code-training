package dev.folomkin.codewars


/**
 * Highest and Lowest
 *
 * В этом небольшом задании вам дана последовательность чисел, разделенных
 * пробелами, и вы должны найти наибольшее и наименьшее из них.
 *
 * highAndLow("1 2 3 4 5") // return "5 1"
 * */

fun highAndLow(numbers: String): String {
    val nums = numbers.split(" ").map(String::toInt)

    val maxNum = nums.maxOrNull()
    val minNum = nums.minOrNull()

    return "$maxNum $minNum"
}

fun main(){
    val res : String = highAndLow("1 2 3 4 5")
    println(res)
}