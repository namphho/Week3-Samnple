package com.example.week3samnple

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by nampham on 4/9/21.
 */
class MainViewModel(userName: String, email: String) : ViewModel() {
    var account : MutableLiveData<Account> = MutableLiveData()
    init {
        account.value = Account(email, userName)
    }

    fun setAccountUserName(userName: String){
        account.value?.username = userName
        account.postValue(account.value)
    }
}