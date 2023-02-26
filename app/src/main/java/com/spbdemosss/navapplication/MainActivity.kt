package com.spbdemosss.navapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.spbdemosss.navapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onBottomNavClick()
    }

    private fun onBottomNavClick(){
        binding.bNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_map -> Toast.makeText(this, "Map", Toast.LENGTH_SHORT).show()
                R.id.menu_points -> Toast.makeText(this, "Points", Toast.LENGTH_SHORT).show()
                R.id.menu_navigation -> Toast.makeText(this, "Navigation", Toast.LENGTH_SHORT).show()
                R.id.menu_orientation -> Toast.makeText(this, "Orientation", Toast.LENGTH_SHORT).show()
                R.id.menu_settings -> Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}