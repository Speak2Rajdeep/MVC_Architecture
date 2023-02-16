package com.example.mvc_architecture

import android.graphics.ColorSpace.Model
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvc_architecture.databinding.ActivityMainBinding
import com.example.mvc_architecture.models.UserModel
import java.util.*

class MainActivity : AppCompatActivity(),Observer {
    private lateinit var binding: ActivityMainBinding
    var myModelClass : UserModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myModelClass = UserModel()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun update(p0: Observable?, p1: Any?) {
        TODO("Not yet implemented")
    }

}