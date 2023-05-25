package com.example.test2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test2.databinding.ItemLayoutBinding
import com.example.test2.model.ItemModel

class Adapter (val items:List<ItemModel>):RecyclerView.Adapter<Adapter.ItemHolder>(){
    inner class ItemHolder(val binding: ItemLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item=items[position]
        holder.binding.imgIcon.setImageResource(item.image)
        holder.binding.tvTitle.text=item.title
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}