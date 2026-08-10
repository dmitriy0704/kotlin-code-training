package dev.folomkin.leetcode.arrays.code


fun main() {
    val strs = arrayOf("flower", "flow", "flight")
    println(longestCommonPrefix(strs))
}

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    val first = strs[0]

    for (i in first.indices) {
        val ch = first[i]
        for (j in 1 until strs.size) {
            if (i >= strs[j].length || strs[j][i] != ch) {
                return first.substring(0, i)
            }
        }
    }

    return first
}
