package com.muktadir.currencyconverter.api

import com.google.gson.GsonBuilder
import com.muktadir.currencyconverter.BuildConfig
import com.muktadir.currencyconverter.util.logger
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClient {
    val gson = GsonBuilder().setLenient().create()
    val client = OkHttpClient
        .Builder()
        .addInterceptor(logger)
        .addInterceptor(TokenInterceptor())
        .build()

    var retrofit: Retrofit? = null
        get() {
            if (field == null) {
                retrofit = Retrofit
                    .Builder()
                    .baseUrl(BuildConfig.BaseUrl)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return field
        }
}