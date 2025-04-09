package com.example.rotalivre.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Selecione um modo de deslocamento"
    }
    val text: LiveData<String> = _text

    // ✅ Add this method to allow updates from the fragment
    fun setText(newText: String) {
        _text.value = newText
    }
}
