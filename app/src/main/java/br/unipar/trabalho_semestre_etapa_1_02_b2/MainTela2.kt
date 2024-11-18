package br.unipar.trabalho_semestre_etapa_1_02_b2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainTela2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_2)

        val btnT3_T2_1 = findViewById<Button>(R.id.btnT2_T3_1)
        val btnT3_T2_2 = findViewById<Button>(R.id.btnT2_T3_2)
        val btnT2VoltaT1 = findViewById<Button>(R.id.btnT2VoltarT1)

        // Botao que vai pra tela 3 = MainTela3
        btnT3_T2_1.setOnClickListener {

            val intent = Intent(this, MainTela3::class.java)
            startActivity(intent)
        }

        // Botao que vai pra tela 3 = MainTela3
        btnT3_T2_2.setOnClickListener {

            val intent = Intent(this, MainTela3::class.java)
            startActivity(intent)
        }

        // Botao que volta pra tela 1 = MainActivity
        btnT2VoltaT1.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}