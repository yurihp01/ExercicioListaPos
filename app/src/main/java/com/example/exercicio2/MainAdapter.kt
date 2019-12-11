package com.example.exercicio2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MainAdapter(users: ArrayList<Person>) : RecyclerView.Adapter<MainHolder>() {
    private val mUsers: List<Person>

    init {
        mUsers = users
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.nome.text = mUsers[position].nome
        holder.sobrenome.text = mUsers[position].sobrenome
    }

    override fun getItemCount(): Int {
        return mUsers.size
    }
}

class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var nome: TextView = itemView.findViewById(R.id.nome)
    var sobrenome: TextView = itemView.findViewById(R.id.sobrenome)

}