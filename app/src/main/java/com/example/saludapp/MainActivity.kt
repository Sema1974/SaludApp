package com.example.saludapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val etName:EditText = findViewById(R.id.etName)
        val name = etName.text.toString()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnHello:AppCompatButton= findViewById(R.id.btnHello)
            btnHello.setOnClickListener()
            {
                /*Toast.makeText(this, "Hello $name!", Toast.LENGTH_LONG).show()
                Log.i("Test", "Boton pulsado" )
                if (name.isNotEmpty()){
                    Snackbar.make(btnHello, "Hello $name!", Snackbar.LENGTH_SHORT).setAnchorView(btnHello).setAction("CLOSE"){finishAffinity()}.show()
                }*/
                val intentGA = Intent(this, GreetingActivity::class.java)
                intentGA.putExtra("EXTRA_NAME", name)
                startActivity(intentGA)
            }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}