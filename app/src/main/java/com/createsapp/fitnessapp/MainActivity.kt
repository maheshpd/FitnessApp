package com.createsapp.fitnessapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.createsapp.fitnessapp.db.RunDAO
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var runDAO: RunDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}