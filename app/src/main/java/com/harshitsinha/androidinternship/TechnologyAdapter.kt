package com.harshitsinha.androidinternship

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TechnologyAdapter(
    private val technologies: List<String>
) : RecyclerView.Adapter<TechnologyAdapter.TechnologyViewHolder>() {

    class TechnologyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTechnology: TextView = itemView.findViewById(R.id.txtTechnology)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TechnologyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_technology, parent, false)

        return TechnologyViewHolder(view)
    }

    override fun onBindViewHolder(holder: TechnologyViewHolder, position: Int) {
        holder.txtTechnology.text = technologies[position]
    }

    override fun getItemCount(): Int {
        return technologies.size
    }
}