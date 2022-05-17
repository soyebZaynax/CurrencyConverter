package com.muktadir.currencyconverter.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muktadir.currencyconverter.api.ApiException
import com.muktadir.currencyconverter.api.ApiResponse
import com.muktadir.currencyconverter.data.responseModel.LiveCurrencyResponseModel
import com.muktadir.currencyconverter.util.LogWriter
import com.muktadir.currencyconverter.util.apiCall
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ViewModel : ViewModel() {
    val successActivatorInfo = MutableLiveData<LiveCurrencyResponseModel>()
    val error = MutableLiveData<String>()
    val isUsernameEmpty = MutableLiveData<String>()
    val isPasswordEmpty = MutableLiveData<String>()
    val progressBar = MutableLiveData<Int>()

    fun getActivatorInfo() {
        viewModelScope.launch {
            try {
                val response =
                    withContext(Dispatchers.IO) { ApiResponse.getResult { apiCall?.getCurrencyRates()!! } }
                if (response.success) {
                    successActivatorInfo.postValue(response)

                }
            } catch (e: ApiException) {
                error.postValue(e.localizedMessage)
                LogWriter.logOutput("Error",e.toString())
            }
        }
    }

    private fun isValidInput(username: String, password: String): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            if (username.isEmpty()) {
                isUsernameEmpty.postValue("This field required")
            }
            if (password.isEmpty()) {
                isPasswordEmpty.postValue("This field required")
            }
            return false
        }
        return true
    }
}
