package com.example.a4_dz1.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a4_dz1.databinding.ItemNameBinding
import com.example.a4_dz1.`interface`.OnClickItemListener
import com.example.a4_dz1.model.HomeModel

class CinemaAdapter(
    private val listText: ArrayList<HomeModel>,
    private val onClickItem: OnClickItemListener
    ): RecyclerView.Adapter<CinemaAdapter.CinemaViewHolder>(){

    inner class CinemaViewHolder(private var binding: ItemNameBinding):RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: HomeModel) {
            binding.txtName.text = model.name
            Glide.with(binding.imageCat.context).load(model.image).into(binding.imageCat)
            itemView.setOnClickListener {
                onClickItem.onClickItemListener(model)
                binding.txtName.text = model.toString(
                )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        return CinemaViewHolder(
            ItemNameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {
        holder.onBind(listText[position])
    }

    override fun getItemCount(): Int {
        return listText.size
    }
}

