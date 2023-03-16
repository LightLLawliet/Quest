package com.example.quest.presentation

import androidx.lifecycle.MutableLiveData
import com.example.quest.data.Repository

class MainViewModel(private val repository: Repository) {

    val liveData = MutableLiveData<ScreenUi>()

    private val idsList = mutableListOf<String>()

    fun nextScreen(id: String) {
        val screenUi = repository.nextScreen(id)
        liveData.value = screenUi
    }

    fun canGoBack(): Boolean {
        return idsList.isEmpty()
    }

    fun goBack() {
        liveData.value = repository.nextScreen(idsList[idsList.size - 1])
        idsList.removeLast()
    }
}