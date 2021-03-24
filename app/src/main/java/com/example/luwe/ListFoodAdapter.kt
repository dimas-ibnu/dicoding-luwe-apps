package com.example.luwe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFoodAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback




    override fun getItemCount(): Int {
        return listFood.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(food: Food)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var tvDesc: TextView = itemView.findViewById(R.id.tv_item_desc)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_food)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.food_item, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listFood[holder.adapterPosition]) }

        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.img)
            .apply(RequestOptions().override(100, 100))
            .into(holder.imgPhoto)
        holder.tvName.text = food.name
        holder.tvPrice.text = "Rp. " + food.price.toString()
        holder.tvDesc.text = food.desc

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked((listFood[holder.adapterPosition]))
        }
    }


}