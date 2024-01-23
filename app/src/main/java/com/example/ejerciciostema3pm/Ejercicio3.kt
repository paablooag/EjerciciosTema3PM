package com.example.ejerciciostema3pm

import android.content.ClipData
import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciostema3pm.databinding.ActivityEjercicio3Binding

class Ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding=ActivityEjercicio3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val añadir=findViewById<Button>(R.id.añadir)
        var listaItem= mutableListOf<ClipData.Item>()
        var listanombres= mutableListOf<String>("Warden","Warden de Raul","Pito de Warden","Pito de Raul","Pito de Warden de Raul","Pito de Raul de Warden","Pito de Warden de Raul de Raul","Pito de Raul de Warden de Raul","Pito de Warden de Raul de Raul de Warden","Pito de Raul de Warden de Raul de Raul")
        var random=(0..listanombres.size).random()
        var itemAdaptador:AnadirAdapter
        var seleccionadosAdapter:SeleccionadosAdapter


        añadir.setOnClickListener {
            random=(0..listanombres.size-1).random()
            var newItem= ClipData.Item(listanombres.get(random), R.drawable.pito3.toString())
            listaItem.add(newItem)
            itemAdaptador=AnadirAdapter(listaItem,this)
            seleccionadosAdapter=SeleccionadosAdapter(listaItem,this)

            binding.anadirView.apply {
                layoutManager= LinearLayoutManager(this@Ejercicio3)
                adapter=itemAdaptador
                adapter!!.notifyDataSetChanged()
            }



        }




    }


}