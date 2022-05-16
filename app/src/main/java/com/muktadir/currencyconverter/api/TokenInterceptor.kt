package com.muktadir.currencyconverter.api

import com.muktadir.currencyconverter.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class TokenInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        if (BuildConfig.ApiKey != null
            && (!originalRequest.url.toString().contains("apikey"))
        ) {
            val builder = originalRequest.newBuilder()
            builder.addHeader("apikey", BuildConfig.ApiKey)
            val request = builder.build()
            return chain.proceed(request)
        }
        return chain.proceed(originalRequest)
    }
}