package com.dza.movieapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dza.movieapp.databinding.ActivityDetailMovieBinding

class DetailMovieActivity: AppCompatActivity() {
    private lateinit var binding: ActivityDetailMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengambil data
        val image = intent.getIntExtra("imageId", 0) ?: "Empty"
        val title = intent.getStringExtra("title") ?: "123"
        val duration = intent.getStringExtra("duration") ?: "Empty"
        val rating = intent.getStringExtra("rating") ?: "Empty"
        val synopsis = intent.getStringExtra("synopsis") ?: "Empty"

        with(binding) {
            actionBack.setOnClickListener {
                finish()
            }
            imageMovieDetail.setImageResource(image as Int)
            titleMovieDetail.text = title
            durasiDetailMovie.text = duration
            ratingDetailMovie.text = rating
            txtDesc.text = synopsis

            bookMovie.setOnClickListener {
                Toast.makeText(this@DetailMovieActivity, "Booking Film...", Toast.LENGTH_SHORT).show()
            }
        }
    }
}