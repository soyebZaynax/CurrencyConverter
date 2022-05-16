package com.muktadir.currencyconverter.api

import com.muktadir.currencyconverter.data.CurrencyRates
import com.muktadir.currencyconverter.data.CurrencyTypes
import retrofit2.http.GET


interface ApiList {

    @GET("list")
    suspend fun getCurrencyTypes(
    ): CurrencyTypes

    @GET("live")
    suspend fun getCurrencyRates(
    ): CurrencyRates
}