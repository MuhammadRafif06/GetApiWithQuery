package com.rafif.getapiwithquery.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.rafif.getapiwithquery.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usnGit = "salim"

        val viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        viewModel.searchUserApi(usnGit)

        viewModel.getUser().observe(this){
            Log.i("TAG", "onCreate: $it")

            println("nama saya ---> ${it.items?.get(0)?.login}")
        }

    }
}