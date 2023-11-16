package com.alexblanco.recyview_result

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.DataBindingUtil.setContentView
import com.alexblanco.recyview_result.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val personasList = ArrayList<Persona>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val edtNombre = binding.nom
        val edtEdad = binding.edat
        val butSeg = binding.buttseg
        val butMas = binding.butmas

        butMas.setOnClickListener {
            val nombre = edtNombre.text.toString()
            val edad = edtEdad.text.toString()

            if (nombre.isNotEmpty() && edad.isNotEmpty()) {
                personasList.add(Persona(nombre, edad))
                Toast.makeText(this, "Una persona més a la llista", Toast.LENGTH_SHORT).show()
                edtNombre.text.clear()
                edtEdad.text.clear()
            } else {
            }
        }

        butSeg.setOnClickListener {
            val intent = Intent(this, Persona::class.java)
            intent.putParcelableArrayListExtra("personasList", personasList)
            startActivity(intent)
        }
    }}