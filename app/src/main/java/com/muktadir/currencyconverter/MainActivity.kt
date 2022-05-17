package com.muktadir.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.material.snackbar.Snackbar
import com.muktadir.currencyconverter.util.LogWriter
import com.muktadir.currencyconverter.viewModel.ViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var  viewModel : ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[ViewModel::class.java]

        Log.d("ApiKey",BuildConfig.ApiKey)
        Log.d("BaseUrl",BuildConfig.BaseUrl)

        viewModel.getActivatorInfo()

    }

    private fun observers(){

        viewModel.successActivatorInfo.observe( this,{
            LogWriter.logOutput("Test",it.quotes.toString())
        }
        )

    }
}