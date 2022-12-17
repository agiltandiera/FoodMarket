package com.tandiera.project.foodmarket.ui.home.newTaste

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tandiera.project.foodmarket.databinding.ItemHomeVerticalBinding
import com.tandiera.project.foodmarket.model.dummy.HomeModel
import com.tandiera.project.foodmarket.utils.Helpers.formatPrice

class HomeNewTasteAdapter (
    private val listData : List<HomeModel>,
    private val itemAdapterCallback : ItemAdapterCallback,
) : RecyclerView.Adapter<HomeNewTasteAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int) : ViewHolder {
        val binding = ItemHomeVerticalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeNewTasteAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class ViewHolder(val binding: ItemHomeVerticalBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: HomeModel, itemAdapterCallback : ItemAdapterCallback) {
            itemView.apply {
                binding.tvTitleItemHomeVertical.text = data.title
                binding.tvHargaItemHomeVertical.formatPrice(data.title)
                binding.rbItemHomeVertical.rating = data.rating

//                Glide.with(context)
//                    .load(data.src)
//                    .into(binding.ivPosterHomeHorizontal)

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