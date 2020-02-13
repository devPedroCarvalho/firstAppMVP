package com.devpedrocarvalho.firstappmvp.ui.frutas

interface FrutasContrato {

    interface View{
        fun mostrarDados(frutas: Array<String>)

    }

    interface Presenter{
        //buscar lista de frutas na camada de modelo
        fun getFrutas()


    }

}