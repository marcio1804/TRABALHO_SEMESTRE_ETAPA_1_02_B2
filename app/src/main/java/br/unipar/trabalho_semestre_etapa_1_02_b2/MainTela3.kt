package br.unipar.trabalho_semestre_etapa_1_02_b2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainTela3 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_3)

        val btnAtivarRota = findViewById<Button>(R.id.btnT3AtivarRota)
        val btnT3VoltarT2 = findViewById<Button>(R.id.btnT3VoltarT2)

        // Botao que Ativa a rota = MainActivity
        btnAtivarRota.setOnClickListener {

            val intent = Intent(this, MainMapa::class.java)
            startActivity(intent)
        }

        // Botao que vai pra tela 2 = MainTela2
        btnT3VoltarT2.setOnClickListener {

            val intent = Intent(this, MainTela2::class.java)
            startActivity(intent)
        }

    }
}