package com.example.a4_dz1.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a4_dz1.databinding.ItemNameBinding
import com.example.a4_dz1.model.HomeModel

class CatsAdapter(
    private val listText: ArrayList<HomeModel>,
) : RecyclerView.Adapter<CatsAdapter.CatViewHolder>() {

    inner class CatViewHolder(private var binding: ItemNameBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: HomeModel) {
            binding.txtName.text = model.name
            Glide.with(binding.imageCat.context).load(model.image).into(binding.imageCat)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        return CatViewHolder(
            ItemNameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.onBind(listText[position])
    }

    override fun getItemCount(): Int {
        return listText.size
    }
}