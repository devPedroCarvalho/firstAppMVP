package com.devpedrocarvalho.firstappmvp.ui.frutas

import com.devpedrocarvalho.firstappmvp.model.RepositorioFrutas

class FrutasPresenter(private val view: FrutasContrato.View): FrutasContrato.Presenter {

    private val repositorioFrutas =  RepositorioFrutas()

    override fun getFrutas() {
       // pegas os dados para apresenta-los
        val  frutas = repositorioFrutas.getFrutas()
        view.mostrarDados(frutas)

    }



}