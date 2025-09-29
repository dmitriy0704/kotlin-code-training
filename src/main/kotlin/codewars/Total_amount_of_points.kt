package dev.folomkin.codewars

fun points(games: List<String>): Int {

    val delimiter = ":"

    if (games.size > 10) return 0
    val res = games.map {
        val r = it.split(delimiter)
        val n1 = r[0].toInt()
        val n2 = r[1].toInt()
        if (n1 > n2) 3 else (if (n1 == n2) 1 else 0)

    }.sum()

    return res

}

fun main() {
    val listPoints = listOf(
        "1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"    )
    println(points(listPoints))

}

