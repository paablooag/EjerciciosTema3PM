package com.example.ejerciciostema3pm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciostema3pm.databinding.ItemAjedrezBinding

class AjedrezAdaptador(var listaAjedrez: MutableList<Ajedrez>, private val listener: Ejercicio2): RecyclerView.Adapter<AjedrezAdaptador.ViewHolder>() {
    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val binding = ItemAjedrezBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_ajedrez, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listaAjedrez.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ajedrez = listaAjedrez.get(position)
        holder.binding
        holder.binding.nombreAjedrez.text=ajedrez.nombre
        holder.binding.imagenAjedrez.setImageResource(ajedrez.imageView)
    }
}