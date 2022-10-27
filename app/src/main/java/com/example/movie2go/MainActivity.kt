package com.example.movie2go

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movie2go.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val movielist = arrayListOf<String>("Pathaan", "Jawan", "Dunky", "MI", "Planet of Apes")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnPickOne.setOnClickListener {
            println("Clicked")
            val random = Random
            val randomMovie = random.nextInt(movielist.count())
            binding.tvWatch.text = movielist[randomMovie]

        }
        binding.btnAddMovie.setOnClickListener {
            val newmovie = binding.tvAddMovie.text.toString()
            movielist.add(newmovie)
            binding.tvAddMovie.text.clear()
        }
    }
}