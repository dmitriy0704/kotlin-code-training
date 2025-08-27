package dev.folomkin.codewars


//-> Write a program that finds the summation of
// every number from 1 to num (both inclusive). The
// number will always be a positive integer greater than 0.
// Your function only needs to return the result, what is shown
// between parentheses in the example below is how you reach that
// result and it's not part of it, see the sample tests.


// Напишите программу, которая вычисляет сумму всех чисел от
// 1 до указанного числа (включительно). Число всегда будет положительным
// целым числом, большим 0. Ваша функция должна возвращать только результат.
// В примере ниже в скобках показано, как получить этот результат, и это не
// является его частью. См. примеры тестов.

object GrassHopper {
    //    fun summation(n: Int) = (1..n).sum()
    fun summation(n: Int): Int {
        var sum = 0
        val range = 0..n step 1
        if (n > 0) {
            for (i in range) {
                sum += i
            }
        }
        return sum
    }
}

fun main() {
    val res = GrassHopper.summation(2)
    println(res)
}