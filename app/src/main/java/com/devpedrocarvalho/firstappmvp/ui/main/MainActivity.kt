package com.devpedrocarvalho.firstappmvp.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.devpedrocarvalho.firstappmvp.R
import com.devpedrocarvalho.firstappmvp.ui.frutas.FrutasActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContrato.View {

    // conectar a ativity com a camada presenter
    private lateinit var  presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          //inicializa o presenter
        presenter = MainPresenter(this)



        //acao do botao
        entrarBT.setOnClickListener {
            //resgatar nome dos componentes
            val nome = nomeET.text.toString()
            val senha = senhaET.text.toString()
            presenter.entrarClicado(nome, senha = senha)

        }

    }

    override fun mostrarMensagem(texto: String) {
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
    }

    override fun iniciarActivityFrutas() {
        startActivity(Intent(this, FrutasActivity::class.java))
    }


}
