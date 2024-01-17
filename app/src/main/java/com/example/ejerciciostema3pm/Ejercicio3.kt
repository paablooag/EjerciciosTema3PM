package com.example.ejerciciostema3pm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Ejercicio3 : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var pokemonAdapter: PokemonAdapter
    private lateinit var addPokemonButton: Button
    private lateinit var deletePokemonButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun ejercicio4(view: View) {}
}