package com.example.ejerciciostema3pm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class Adaptador(private val datos:List<Contacto>): RecyclerView.Adapter<Adaptador.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adaptador.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contacto, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adaptador.ViewHolder, position: Int) {
       val currentItem = datos[position]
        holder.bind(currentItem)
    }

    override fun getItemCount() = datos.size

    inner class ViewHolder (itemView: View) :  RecyclerView.ViewHolder(itemView){
        private val textoTitulo: TextView = itemView.findViewById(R.id.nombreContacto)
        private val textoCorreo:TextView = itemView.findViewById(R.id.correoContacto)
        private val textoNumero:TextView = itemView.findViewById(R.id.numeroContacto)
        private val imagenIcono: ImageView = itemView.findViewById(R.id.imagenContacto)

        fun bind(item: Contacto){
            textoTitulo.text = item.nombre
            textoCorreo.text = item.correo
            textoNumero.text = item.numero.toString()
            imagenIcono.setImageResource(item.imageView)
        }
    }

}