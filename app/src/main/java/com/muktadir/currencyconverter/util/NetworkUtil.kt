package com.muktadir.currencyconverter.util


import com.muktadir.currencyconverter.api.ApiList
import com.muktadir.currencyconverter.api.RetrofitClient
import okhttp3.logging.HttpLoggingInterceptor


val logger = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)


val apiCall = RetrofitClient.retrofit?.create(ApiList::class.java)