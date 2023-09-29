/*
//MAİN ACTİVİTY
package com.selin.pinterestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.selin.pinterestapp.data.entity.Photos
import com.selin.pinterestapp.databinding.ActivityMainBinding
import com.selin.pinterestapp.uı.adapter.PhotosAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var photosAdapter: PhotosAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val photosList = mutableListOf<Photos>()
        photosList.add(Photos(1, "image1", 600, "image1"))
        photosList.add(Photos(2, "image2", 500, "image2"))
        photosList.add(Photos(3, "image3", 600, "image3"))
        photosList.add(Photos(4, "image4", 500, "image4"))
        photosList.add(Photos(5, "image5", 600, "image5"))
        photosList.add(Photos(6, "image6", 500, "image6"))
        photosList.add(Photos(7, "image7", 600, "image7"))
        photosList.add(Photos(8, "image8", 500, "image8"))
        photosList.add(Photos(9, "image9", 600, "image9"))
        photosList.add(Photos(10, "image10", 500, "image10"))
        photosList.add(Photos(11, "image11", 600, "image11"))
        photosList.add(Photos(12, "image12", 500, "image12"))

        photosAdapter = PhotosAdapter(this, photosList)
        binding.recyclerView.adapter = photosAdapter
        binding.recyclerView.layoutManager = GridLayoutManager(this, 2)


    }

}


//PHOTOS ADAPTER
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


        val layoutParams = t.cardView.layoutParams
        layoutParams.height = photos.card_height
        t.cardView.layoutParams = layoutParams

        t.cardView.setOnClickListener {
            Toast.makeText(mContext, "${photos.photo_name} selected.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return photosList.size
    }
}
 */