package com.example.exercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val personList = arrayListOf<Person>(Person("Yuri", "Gabriel"),
            Person("Rafael", "Marcelo"), Person("Luiz", "Jorge"),
            Person("Tiago", "Galhardo"), Person("Reinaldo", "Marcio"),
            Person("Willian", "Beto"), Person("João", "Felipe"),
            Person("Diego", "Medina"), Person("Souza", "Santos"),
            Person("Almeida", "Alberg"), Person("Nunes", "Arcindo"),
            Person("Willians", "Flier"), Person("Olnar", "Palmeira"),
            Person("Tavares", "Ribas"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recycler_view_layour_recycler)
        recycler.setHasFixedSize(true)
        val adapter = MainAdapter(personList)
        recycler.adapter = adapter


    }
}
