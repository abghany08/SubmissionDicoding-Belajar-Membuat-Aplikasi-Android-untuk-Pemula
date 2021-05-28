package com.gna.eplteamapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewTeamAdapter(private val listTeam: ArrayList<Team>) : RecyclerView.Adapter<CardViewTeamAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_team, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val team = listTeam[position]
        val (name, detail) = listTeam[position]

        Glide.with(holder.itemView.context)
                .load(team.photo)
                .apply(RequestOptions().override(350, 550))
                .into(holder.imgPhoto)

        holder.tvName.text = team.name
        holder.tvDetail.text = team.detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailTeam::class.java)
            moveDetail.putExtra(DetailTeam.EXTRA_NAME, name)
            moveDetail.putExtra(DetailTeam.EXTRA_DETAIL, detail)
            moveDetail.putExtra(DetailTeam.EXTRA_PHOTO, team.photo)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listTeam.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }
}