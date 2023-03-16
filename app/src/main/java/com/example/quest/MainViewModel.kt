package com.example.quest

import androidx.lifecycle.MutableLiveData

class MainViewModel(private val repository: Repository) {

    val liveData = MutableLiveData<ScreenUi>()

    fun nextScreen(id: String) {
        val screenUi = repository.nextScreen(id)
        liveData.value = screenUi
    }
}