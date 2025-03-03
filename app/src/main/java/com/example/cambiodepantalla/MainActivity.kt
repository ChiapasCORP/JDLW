package com.example.cambiodepantalla

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Realizar el cazamiento del boton con la logica
        val button = findViewById<ImageView>(R.id.btn_config)
        // val button:Button = findViewById()
        // Funcionamiento Onclick
        button.setOnClickListener {
            //Crear un Inten clases
            val intent = Intent(this,SegundaPantalla::class.java)
            //Inicializar el intent
            startActivity(intent)
        }




    }
}