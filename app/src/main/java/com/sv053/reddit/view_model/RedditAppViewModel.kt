package com.sv053.reddit.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sv053.reddit.parcelable.LoginDataState
import timber.log.Timber

class RedditAppViewModel : ViewModel(){

    init {
        Timber.d("AppViewModel init ${hashCode()}")
    }

    private val mutableState = MutableLiveData(LoginDataState(login = ""))

    val state: LiveData<LoginDataState>
        get() = mutableState

    override fun onCleared() {
        super.onCleared()
        Timber.d("RedditAppViewModel onCleared ${hashCode()}")
    }

    fun writeLogin(log:String){
        mutableState.value = LoginDataState(log)
    }

}