package com.alexblanco.recyview_result

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alexblanco.recyview_result.Adapter.PersonaAdapter
import com.alexblanco.recyview_result.databinding.ActivityPersonaproviderBinding

class PersonaProvider : AppCompatActivity() {

    private lateinit var binding: ActivityPersonaproviderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonaproviderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = binding.recyclerView

        val personasList: ArrayList<Persona>? =
            intent.getParcelableArrayListExtra("personasList")

        if (personasList != null) {
            val adapter = PersonaAdapter(personasList)

            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = adapter
        }
    }
}