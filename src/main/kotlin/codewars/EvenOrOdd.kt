package dev.folomkin.codewars


class EvenOrOdd {
//-> Create a function that takes an integer as an argument and returns
//   "Even" for even numbers or "Odd" for odd numbers.

    fun evenOrOdd(number: Int): String {
        if (number != 0) {
            return if (number % 2 == 0) "Even" else return "Odd"
        }
        return ""
    }
}

fun main() {
    val res = EvenOrOdd().evenOrOdd(2);
    println(res)
}