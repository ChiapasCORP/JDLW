package com.example.cambiodepantalla

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Realizar el cazamiento del boton con la logica
        val button = findViewById<ImageView>(R.id.btn_Salud)
        // val button:Button = findViewById()
        // Funcionamiento Onclick
        button.setOnClickListener {
            //Crear un Inten clases
            val intent = Intent(this,Salud::class.java)
            //Inicializar el intent
            startActivity(intent)
        }
        val button2 = findViewById<ImageView>(R.id.btn_Actividad)
        button2.setOnClickListener {
            val intent = Intent(this, Electro::class.java)
        }

        val button3 = findViewById<ImageView>(R.id.btn_calendario)
        button3.setOnClickListener {
            val intent = Intent(this, Calendario::class.java)
        }

        val button4 = findViewById<ImageView>(R.id.btn_ia)
        button4.setOnClickListener {
            val intent = Intent(this, IA::class.java)
        }
        val button5 = findViewById<ImageView>(R.id.btn_config)
        button5.setOnClickListener {
            val intent = Intent(this, Ajustes::class.java)
        }
        val button6 = findViewById<ImageView>(R.id.btn_usuario)
        button6.setOnClickListener {
            val intent = Intent(this, Usuario::class.java)
        }

    }
}