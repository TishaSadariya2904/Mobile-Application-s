package com.example.neisha_heritageapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CountryAdapter(private val countryList:ArrayList<Country>)
    : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(){

    class CountryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
        val desc : TextView = itemView.findViewById(R.id.desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.country,parent,false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countryList[position]
        holder.imageView.setImageResource(country.image)
        holder.textView.text = country.name
        holder.desc.text = country.desc

    }

    override fun getItemCount(): Int {
        return countryList.size
    }
}