package com.devpedrocarvalho.firstappmvp.ui.frutas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.devpedrocarvalho.firstappmvp.R

class FrutasActivity : AppCompatActivity(), FrutasContrato.View {

    private lateinit var presenter: FrutasPresenter

    // adapter
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var lista: ListView

    //private var dados = arrayOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        presenter = FrutasPresenter(this)


        lista = findViewById<ListView>(R.id.listaFrutaLV)
       // lista.adapter = adapter

        //carregamento da lista de frutas
        presenter.getFrutas()



    }

    override fun mostrarDados(frutas: Array<String>) {
        // recolher os dados do presenter para enviar para o adapter
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, frutas)
        lista.adapter = adapter

        }

    }

