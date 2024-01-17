package com.example.ejerciciostema3pm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejerciciostema3pm.databinding.ActivityEjercicio2Binding

class Ejercicio2 : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio2Binding
    private lateinit var ajedrezAdaptador: AjedrezAdaptador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = mutableListOf(
            Ajedrez(R.drawable.pito3,"Peón"),
            Ajedrez(R.drawable.pito4,"Torre"),
            Ajedrez(R.drawable.pito3,"Caballo"),
            Ajedrez(R.drawable.pito4,"Alfil"),
            Ajedrez(R.drawable.pito5,"Reina"),
            Ajedrez(R.drawable.pito6,"Rey")
        )

        ajedrezAdaptador = AjedrezAdaptador(data,this)

        binding.recyclerView.apply {
            layoutManager= LinearLayoutManager(this@Ejercicio2)
            adapter=ajedrezAdaptador
        }

        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }
    fun ejercicio3(view: View) {
        Intent (this, Ejercicio3::class.java).also {
            startActivity(it)
        }
    }
}