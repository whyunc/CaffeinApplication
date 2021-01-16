package com.example.caffeinapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewCoffeeAdapter(private val ListCoffee: ArrayList<Coffee>): RecyclerView.Adapter<CardViewCoffeeAdapter.CardViewViewHolder> () {

    class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgCoffee: ImageView = itemView.findViewById(R.id.img_item_photo)
        var titleCoffee: TextView = itemView.findViewById(R.id.tv_item_title)
        var detailCoffee: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnShow: Button = itemView.findViewById(R.id.btn_show)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_coffee, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ListCoffee.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val Coffee = ListCoffee[position]

        Glide.with(holder.itemView.context)
            .load(Coffee.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgCoffee)

        holder.titleCoffee.text = Coffee.title
        holder.detailCoffee.text = Coffee.detail
        val mContext = holder.itemView.context

        holder.btnShow.setOnClickListener {
            val moveDetail = Intent(mContext, DetailActivity::class.java)
            moveDetail.putExtra(DetailActivity.EXTRA_PHOTO, Coffee.photo)
            moveDetail.putExtra(DetailActivity.EXTRA_TITLE, Coffee.title)
            moveDetail.putExtra(DetailActivity.EXTRA_TIME, Coffee.time)
            moveDetail.putExtra(DetailActivity.EXTRA_TYPE, Coffee.type)
            moveDetail.putExtra(DetailActivity.EXTRA_DETAIL, Coffee.detail)
            moveDetail.putExtra(DetailActivity.EXTRA_INGREDIENTS, Coffee.ingredients)
            moveDetail.putExtra(DetailActivity.EXTRA_STEPS, Coffee.steps)
            mContext.startActivity(moveDetail)
        }
    }

}