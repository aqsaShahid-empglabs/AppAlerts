package com.appalerts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.snackbars.CustomSnackBars

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CustomSnackBars.showCustomToast(this)
    }
}