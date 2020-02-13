package com.devpedrocarvalho.firstappmvp.ui.main

interface MainContrato {
    interface View {
        fun mostrarMensagem(texto: String)
        fun iniciarActivityFrutas()
    }

    interface Presenter{
        // sera chamado quando o botao entrar for clicado
        fun entrarClicado(nome: String, senha: String)

    }

}