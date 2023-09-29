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
        photosList.add(Photos(1,"What is Web Design", "","image1", 700, "image1"))
        photosList.add(Photos(2,"","", "image6", 500, "image6"))
        photosList.add(Photos(3,"Professional escape", "","image8", 650, "image8"))
        photosList.add(Photos(4,"", "glow", "image7",500, "image7"))
        photosList.add(Photos(5,"", "glow", "image12",650, "image12"))
        photosList.add(Photos(6,"", "", "image9",500, "image9"))
        photosList.add(Photos(7,"", "", "image3",600, "image3"))
        photosList.add(Photos(8,"", "glow", "image4",650, "image4"))


        photosAdapter = PhotosAdapter(this, photosList)
        binding.recyclerView.adapter = photosAdapter
        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)


    }

}