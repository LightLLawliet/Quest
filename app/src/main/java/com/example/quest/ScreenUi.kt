package com.example.quest

import android.graphics.Color
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
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


