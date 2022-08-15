package com.ansela.skincareproject.UI

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ansela.skincareproject.R
import com.ansela.skincareproject.data.SkincareData
import com.squareup.picasso.Picasso

class ListSkincareAdapter(private val listSkincare: ArrayList<SkincareData>) : RecyclerView.Adapter<ListSkincareAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvHarga: TextView = itemView.findViewById(R.id.tv_item_harga)
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_skincare, viewGroup,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val skincare = listSkincare[position]

        skincare.photo?.let {
            Picasso.with(holder.itemView.context)
                .load(it)
                .resize(50,50)
                .into(holder.imgPhoto)
        }

        holder.tvName.text = skincare.nama
        holder.tvHarga.text = skincare.harga
        holder.itemView.setOnClickListener{onItemClickCallback.onItemClickedData(listSkincare[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listSkincare.size
    }

    interface OnItemClickCallback {
        fun onItemClickedData(data:SkincareData)
}
}
