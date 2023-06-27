package com.example.custom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.custom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(this.binding.root)

        this.binding.followersIndicator.setCounter("500")
        this.binding.followersIndicator.setIndicator("Seguindo")
        this.binding.profileImg.setVisualized(true)
        this.binding.profileImg.setImageProfile(R.drawable.user_profile)
    }
}