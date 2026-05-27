package dev.folomkin.codewars


/**
 *
 * Дана строка. Необходимо отдельно преобразовать в верхний регистр буквы,
 * занимающие четные и нечетные индексы, и вернуть результат, как показано
 * ниже. Индекс 0 будет считаться четным.
 *
 * Например, capitalize("abcdef") = ['AbCdEf', 'aBcDeF'].
 * См. тестовые примеры для получения дополнительной информации.
 *
 * Входными данными будет строка в нижнем регистре без пробелов.
 *
 * */

fun capitalize(text: String): List<String> {
    //TODO: Add your code!
     val firstWord = text.mapIndexed { index, ch ->
         if (index % 2 == 0) ch.uppercase() else ch.lowercase()
     }.joinToString("")

    val secondWord = text.mapIndexed { index, ch ->
        if (index % 2 != 0) ch.uppercase() else ch.lowercase()
    }.joinToString("")

    return listOf(firstWord, secondWord)
}

fun main(args: Array<String>) {
    val text = "abcdefghij"
    println(capitalize(text))
}