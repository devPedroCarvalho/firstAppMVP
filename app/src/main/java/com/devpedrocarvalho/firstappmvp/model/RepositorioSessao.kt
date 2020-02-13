package com.devpedrocarvalho.firstappmvp.model


//busca de dados ao servidor local para enviar ao presenter
//logica de dados
class RepositorioSessao {

    val nome = "aula"
    val senha = "1234"

    fun login(mNome: String, mSenha: String): Boolean{
        return mNome == nome && mSenha == senha
    }

}