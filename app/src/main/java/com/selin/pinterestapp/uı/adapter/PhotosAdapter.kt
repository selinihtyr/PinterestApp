package com.selin.pinterestapp.uı.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.selin.pinterestapp.data.entity.Photos
import com.selin.pinterestapp.databinding.CardDesignBinding

class PhotosAdapter(var mContext: Context, var photosList: List<Photos>)
    : RecyclerView.Adapter<PhotosAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(var design:CardDesignBinding)
        : RecyclerView.ViewHolder(design.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val inflater = LayoutInflater.from(parent.context)
        val design = CardDesignBinding.inflate(inflater, parent, false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val photos = photosList[position]
        val t = holder.design

        t.ivPhoto.setImageResource(mContext.resources.getIdentifier(photos.photo_image, "drawable", mContext.packageName))
        t.ivEmoji.setImageResource(mContext.resources.getIdentifier(photos.photo_emoji, "drawable", mContext.packageName))

        val layoutParams = t.cardView.layoutParams
        layoutParams.height = photos.card_height
        t.cardView.layoutParams = layoutParams

        t.tvText.text = photos.photo_text

        t.cardView.setOnClickListener {
            Toast.makeText(mContext, "${photos.photo_name} selected.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return photosList.size
    }
}