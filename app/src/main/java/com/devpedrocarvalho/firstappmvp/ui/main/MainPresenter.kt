package com.devpedrocarvalho.firstappmvp.ui.main

import com.devpedrocarvalho.firstappmvp.model.RepositorioSessao

class MainPresenter(private val view: MainContrato.View): MainContrato.Presenter {

    private  var repositorioSessao: RepositorioSessao = RepositorioSessao()



    override fun entrarClicado(nome: String, senha: String) {
        if (nome.isEmpty()){
            view.mostrarMensagem("Nome inválido!")
            return
        }

        if (senha.isEmpty()){
            view.mostrarMensagem("Digite uma senha!")
            return
        }

        // tarefa de login
        val loginSucesso = repositorioSessao.login(nome, senha)

        if (loginSucesso){
            view.mostrarMensagem("Dados Concluidos!")
            view.iniciarActivityFrutas()
        } else{
            view.mostrarMensagem("Erro com os dados!")
        }


    }


}