package com.tandiera.project.foodmarket.ui.home

import android.content.ClipData.Item
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tandiera.project.foodmarket.R
import com.tandiera.project.foodmarket.databinding.ActivityAuthBinding.inflate
import com.tandiera.project.foodmarket.databinding.ItemHomeHorizontalBinding
import com.tandiera.project.foodmarket.model.dummy.HomeModel

class HomeAdapter (
    private val listData : List<HomeModel>,
    private val itemAdapterCallback : ItemAdapterCallback,
) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int) : ViewHolder {
        val binding = ItemHomeHorizontalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        holder.bind(listData(position), itemAdapterCallback)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class ViewHolder(val binding: ItemHomeHorizontalBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: HomeModel, itemAdapterCallback : ItemAdapterCallback) {
            itemView.apply {
                binding.txtTitleHomeHorizontal.text = data.title
                binding.rbFoodHomeHorizontal.rating = data.rating

                Glide.with(context)
                    .load(data.src)
                    .into(binding.ivPosterHomeHorizontal)

                itemView.setOnClickListener {
                    itemAdapterCallback.onClick(it, data)
                }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v : View, data : HomeModel)
    }
}