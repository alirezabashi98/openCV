package com.alireza.bashi.opencv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.opencv.android.OpenCVLoader
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private val tag = "mainActivity_Tag_Log"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (OpenCVLoader.initDebug()){
            Log.i(tag,"OpenCV installed successfully")
        }else{
            Log.i(tag,"OpenCV is not installed")
        }

    }
}