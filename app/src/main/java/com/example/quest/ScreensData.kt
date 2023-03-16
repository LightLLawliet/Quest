package com.example.quest

import com.google.gson.annotations.SerializedName

class ScreensData(
    @SerializedName("screens")
    val screensList: List<ScreenData>
)
