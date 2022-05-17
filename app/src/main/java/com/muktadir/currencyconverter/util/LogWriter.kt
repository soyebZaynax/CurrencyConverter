package com.muktadir.currencyconverter.util

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

class LogWriter {



    companion object {

         var isDebugMode = true

        fun logOutput(tag: String, msg: String) {
            if (isDebugMode)
                Log.d(tag, msg)
        }


        fun getRetrofitClientForLogging(): OkHttpClient{

            val interceptor = HttpLoggingInterceptor()
            interceptor.redactHeader("Authorization");
            interceptor.redactHeader("Cookie");
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            var client = OkHttpClient.Builder().addInterceptor(interceptor).build()

            return client

        }
    }


}