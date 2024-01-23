package com.example.ejerciciostema3pm

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciostema3pm.databinding.ItemNuevoBinding

class AnadirAdapter(var listaItem: MutableList<ClipData.Item>, private val listener: Ejercicio3):RecyclerView.Adapter<AnadirAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding= ItemNuevoBinding.bind(view)
        val borrar= ItemNuevoBinding.bind(view).borrar
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_nuevo,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  listaItem.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=listaItem.get(position)
        val borrar=holder.borrar

        holder.binding.nombre.text=item.text.toString()
        val imageResourceId = item.htmlText?.toIntOrNull() ?: R.drawable.pito3
        holder.binding.imagen.setImageResource(imageResourceId)


        borrar.setOnClickListener {
            listaItem.removeAt(position)
            notifyDataSetChanged()
        }
    }
}