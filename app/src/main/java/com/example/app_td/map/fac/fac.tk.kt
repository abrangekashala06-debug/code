package com.example.app_td.map.fac
class
fun main() {
    val n = 5
    var factoriel = 1
    var i = 1

    while (i <= n) {
        factoriel *= i
        i++
    }

    println("Le factoriel de $n ($n!) est : $factoriel")
}
