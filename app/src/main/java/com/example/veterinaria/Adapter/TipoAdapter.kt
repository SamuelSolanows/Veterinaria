package com.example.veterinaria.Adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.veterinaria.Tipo
import com.example.veterinaria.databinding.ActivityTipoBinding

class TipoAdapter(var tipo:MutableList<Tipo>):RecyclerView.Adapter<TipoAdapter.Holder>(){
    inner class Holder(var binding: ActivityTipoBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return tipo.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }
}