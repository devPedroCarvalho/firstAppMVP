package com.devpedrocarvalho.firstappmvp.model

class RepositorioFrutas {

    private val frutas = arrayOf(
        "Banana",
        "Maça",
        "Banana",
        "Maça",
        "Banana",
        "Maça",
        "Banana",
        "Maça",
        "Banana",
        "Maça"

    )

    fun getFrutas(): Array<String>{
        return frutas
    }
}