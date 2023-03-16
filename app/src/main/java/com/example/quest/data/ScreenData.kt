package com.example.quest.data

import com.google.gson.annotations.SerializedName


class ScreenData(
    @SerializedName("id")
    val id: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("actions")
    val actionsList: List<ActionData>
)