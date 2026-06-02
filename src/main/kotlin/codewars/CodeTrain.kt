package dev.folomkin.codewars

fun main(){
    // 1. Распарсим строку на числа
    val input = "73+42=16"
    val parts = input.split("\\D+".toRegex())
    println(parts)

    //2. Числа развернем и переведем в Int
    val (num1, num2, result) = parts.map { it.reversed().toInt() }

    //3. Ответ:

    return (num1 + num2) == result
}