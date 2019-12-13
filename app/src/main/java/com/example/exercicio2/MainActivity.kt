package com.example.exercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.exercicio2.R.drawable
import com.example.exercicio2.R.drawable.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val personList = arrayListOf(
            Person("Yuri", "Gabriel",   ic_directions_bike_black_24dp),
            Person("Rafael", "Marcelo", ic_face_black_24dp),
            Person("Luiz", "Jorge",     ic_fiber_pin_black_24dp),
            Person("Tiago", "Galhardo", ic_fitness_center_black_24dp),
            Person("Reinaldo", "Marcio", ic_directions_bike_black_24dp),
            Person("Willian", "Beto"   , ic_face_black_24dp),
            Person("João", "Felipe"    , ic_fiber_pin_black_24dp),
            Person("Diego", "Medina"   , ic_fitness_center_black_24dp),
            Person("Souza", "Santos"   , ic_directions_bike_black_24dp),
            Person("Almeida", "Alberg" , ic_face_black_24dp),
            Person("Nunes", "Arcindo"  , ic_fiber_pin_black_24dp),
            Person("Willians", "Flier" , ic_fitness_center_black_24dp),
            Person("Olnar", "Palmeira" , ic_fiber_pin_black_24dp),
            Person("Tavares", "Ribas"  , ic_fitness_center_black_24dp)
        )

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recycler_view_layour_recycler)
        recycler.setHasFixedSize(true)
        val adapter = MainAdapter(personList)
        recycler.adapter = adapter


    }
}
