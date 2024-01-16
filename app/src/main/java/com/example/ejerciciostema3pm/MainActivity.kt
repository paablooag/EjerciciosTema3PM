package com.example.ejerciciostema3pm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
            Contacto(R.drawable.pito6,"Ana María", "anamaria@example.com", 601555666),
            Contacto(R.drawable.ic_launcher_foreground,"Carlos", "carlos@example.com", 601777888),
            Contacto(R.drawable.pito9,"Isabel", "isabel@example.com", 601999000),
            Contacto(R.drawable.ic_launcher_foreground,"Fernando", "fernando@example.com", 602111222),
            Contacto(R.drawable.ic_launcher_foreground,"Laura", "laura@example.com", 602333444),
            Contacto(R.drawable.ic_launcher_foreground,"Manuel", "manuel@example.com", 602555666),
            Contacto(R.drawable.ic_launcher_foreground,"Silvia", "silvia@example.com", 602777888),
            Contacto(R.drawable.ic_launcher_background,"José", "jose@example.com", 602999000),
            Contacto(R.drawable.ic_launcher_foreground,"Beatriz", "beatriz@example.com", 603111222),
            Contacto(R.drawable.ic_launcher_foreground,"Miguel", "miguel@example.com", 603333444),
            Contacto(R.drawable.ic_launcher_foreground,"Natalia", "natalia@example.com", 603555666),
            Contacto(R.drawable.ic_launcher_foreground,"Antonio", "antonio@example.com", 603777888)
        )
        contactoAdaptador = ContactoAdaptador(data,this)

        binding.recyclerView.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=contactoAdaptador
        }
    }
}
