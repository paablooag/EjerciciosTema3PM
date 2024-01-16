package com.example.ejerciciostema3pm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciostema3pm.databinding.ItemContactoBinding

class ContactoAdaptador(var listaContacto: MutableList<Contacto>, private val listener: MainActivity): RecyclerView.Adapter<ContactoAdaptador.ViewHolder>() {
    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val binding =ItemContactoBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contacto, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listaContacto.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val contacto = listaContacto.get(position)
        holder.binding

        holder.binding.nombreContacto.text=contacto.nombre
        holder.binding.correoContacto.text=contacto.correo
        holder.binding.numeroContacto.text=contacto.numero.toString()
        holder.binding.imagenContacto.setImageResource(contacto.imageView)

    }
}