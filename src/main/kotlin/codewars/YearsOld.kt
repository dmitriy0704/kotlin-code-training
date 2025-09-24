package dev.folomkin.codewars

class YearsOld {
    fun getAge(yearsOld: String): Int = yearsOld.substring(0,1).toInt()
}
fun main(){
    val yearsOld = YearsOld()
    val res =  yearsOld.getAge("4 years old")
    println(res)
}