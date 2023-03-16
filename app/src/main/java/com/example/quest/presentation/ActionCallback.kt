package com.example.quest.presentation

interface ActionCallback {

    fun moveToScreen(id: String)

    fun showMessage(message: String)
}