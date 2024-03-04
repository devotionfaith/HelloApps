package com.example.helloapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Class Diawali huruf kapital, Passive
class MainActivity : AppCompatActivity() {
   //Variable huruf kecil, active/passive
    private fun name : String = "Gustian"
    private fun isHavingError : Boolean

// Function huruf kecil, Active
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}