package com.example.quest.presentation

import android.graphics.Color
import android.text.SpannableString
import android.text.method.LinkMovementMethod
import android.widget.TextView

class ScreenUi(
    fullText: String,
    actions: List<ActionUi>
) {

    private val spannableString = SpannableString(fullText)

    init {
        for (action in actions) {
            action.setSpan(spannableString, fullText)
        }
    }

    fun show(textView: TextView) = textView.run {

        text = spannableString
        movementMethod = LinkMovementMethod.getInstance()
        highlightColor = Color.TRANSPARENT
    }
}


