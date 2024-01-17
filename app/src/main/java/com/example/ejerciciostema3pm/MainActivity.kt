package com.example.ejerciciostema3pm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejerciciostema3pm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var contactoAdaptador: ContactoAdaptador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = mutableListOf(
            Contacto(R.drawable.pito3,"Maria José", "mariajosealcaraz@gmail.com", 666789102),
            Contacto(R.drawable.pito4,"Franco", "franfranbogavante@gmail.com", 671882993),
            Contacto(R.drawable.pito5,"Maria", "mariacaraz@gmail.com", 666189102),
            Contacto(R.drawable.pito6,"Mario", "marsealcaraz@gmail.com", 666129102),
            Contacto(R.drawable.pito7,"Pedro", "pedro@example.com", 600111222),
            Contacto(R.drawable.pito8,"Luisa", "luisa@example.com", 600333444),
            Contacto(R.drawable.pito9,"Juan", "juan@example.com", 600555666),
            Contacto(R.drawable.pito6,"Raquel", "raquel@example.com", 601111222),
            Contacto(R.drawable.pito6,"Ana María", "anamaria@example.com", 601555666)
        )

        contactoAdaptador = ContactoAdaptador(data,this)

        binding.recyclerView.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=contactoAdaptador
        }
    }

    fun ejercicio2(view: View) {
        Intent (this, Ejercicio2::class.java).also {
            startActivity(it)
        }
    }
}
