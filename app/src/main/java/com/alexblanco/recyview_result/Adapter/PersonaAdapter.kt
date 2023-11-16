package com.alexblanco.recyview_result.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alexblanco.recyview_result.Persona
import com.alexblanco.recyview_result.R


class PersonaAdapter(private val personas: List<Persona>) :
    RecyclerView.Adapter<PersonaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.persona, parent, false)
        return PersonaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val persona = personas[position]
        holder.bind(persona)
    }

    override fun getItemCount(): Int {
        return personas.size
    }
}