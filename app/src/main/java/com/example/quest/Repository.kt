package com.example.quest

import android.content.Context
import androidx.annotation.RawRes
import com.google.gson.Gson

interface Repository {

    fun nextScreen(id: String): ScreenUi

    class Base(
        private val actionCallback: ActionCallback,
        readRawResource: ReadRawResource,
        gson: Gson
    ) : Repository {

        private val screensData =
            gson.fromJson(readRawResource.read(R.raw.quest), ScreensData::class.java)

        override fun nextScreen(id: String): ScreenUi {
            screensData.screensList.find {
                it.id == id
            }!!.let { screensData ->
                val actions = screensData.actionsList.map { actionData ->
                    ActionUi(actionCallback, actionData.screenId, actionData.text)
                }
                return ScreenUi(screensData.text, actions)
            }
        }
    }
}
