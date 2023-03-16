package com.example.quest.data

import com.google.gson.annotations.SerializedName

class ActionData(
    @SerializedName("key")
    val text: String,
    @SerializedName("action")
    val screenId: String
)