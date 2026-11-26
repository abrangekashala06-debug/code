package com.example.app_td.map

class tk {
    fun main() {

        val promotions: MutableMap<String, Int> = mutableMapOf(
            "L1Info" to 350,
            "L2Info" to 200,
            "L3Info" to 100
        )
        promotions["M1Info"] = 50
        promotions["M2Info"] = 35

        val listeCles: List<String> = promotions.keys.toList()
        val listeValeurs: List<Int> = promotions.values.toList()

        println("Ensemble des clés : ${promotions.keys}")
        println("Ensemble des valeurs : ${promotions.values}")

        println("Nombre d'items dans la Map : ${promotions.count()}")

        println("Nombre d'éléments des clés : ${promotions.keys.count()}")
        println("Nombre d'éléments des valeurs : ${promotions.values.count()}")
    }
}
