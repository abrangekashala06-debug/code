package com.example.app_td.map

class exercice{
    
    fun main() {
        val phrase = "Je suis etudiant en M1 Info a l'Universite de Mbujimayi"

        val referenceVoyelles = listOf('a', 'e', 'i', 'o', 'u', 'y')
        val referenceConsonnes = listOf(
            'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
            'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'
        )

        val voyelles: MutableList<Char> = mutableListOf()
        val consonnes: MutableList<Char> = mutableListOf()

        for (caractere in phrase.lowercase()) {
            if (caractere in referenceVoyelles) {
                voyelles.add(caractere)
            } else if (caractere in referenceConsonnes) {
                consonnes.add(caractere)
            }
        }
        println("Liste des voyelles (${voyelles.count()} éléments) : $voyelles")
        println("Liste des consonnes (${consonnes.count()} éléments) : $consonnes")
    }

}