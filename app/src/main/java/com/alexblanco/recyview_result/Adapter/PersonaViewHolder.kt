package com.alexblanco.recyview_result.Adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alexblanco.recyview_result.Persona
import com.alexblanco.recyview_result.R

class PersonaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(persona: Persona) {
        itemView.findViewById<TextView>(R.id.nom).text = persona.nom
        itemView.findViewById<TextView>(R.id.edat).text = persona.edad
    }
}