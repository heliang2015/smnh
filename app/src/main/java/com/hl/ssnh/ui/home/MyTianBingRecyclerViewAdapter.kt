package com.hl.ssnh.ui.home

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hl.ssnh.R
import com.hl.ssnh.databinding.FragmentItemBinding
import com.hl.ssnh.ui.home.placeholder.PlaceholderContent.PlaceholderItem
import com.hl.ssnh.ui.model.GpInfoModel


/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyTianBingRecyclerViewAdapter(
    private val values: List<GpInfoModel>
) : RecyclerView.Adapter<MyTianBingRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.gpName
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.itemName
        val contentView: TextView = binding.itemHangye

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}