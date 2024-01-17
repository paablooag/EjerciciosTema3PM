package com.example.ejerciciostema3pm
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PokemonAdapter(private val pokemonList: MutableList<Pokemon>) :
    RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    inner class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombreTextView: TextView = itemView.findViewById(R.id.tvNombrePokemon)
        val tipoTextView: TextView = itemView.findViewById(R.id.tvTipoPokemon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pokemon, parent, false)
        return PokemonViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val currentPokemon = pokemonList[position]
        holder.nombreTextView.text = currentPokemon.nombre
        holder.tipoTextView.text = currentPokemon.tipo
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }
}
