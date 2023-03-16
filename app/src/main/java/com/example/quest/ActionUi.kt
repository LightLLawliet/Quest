package com.example.quest

import android.graphics.Color
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.style.ClickableSpan
import android.view.View

class ActionUi(
    private val actionCallback: ActionCallback,
    private val id: String,
    private val text: String
) {
    private val clickableSpan = object : ClickableSpan() {
        override fun onClick(widget: View) {
            actionCallback.moveToScreen(id)
        }

        override fun updateDrawState(ds: TextPaint) {
            super.updateDrawState(ds)
            ds.isUnderlineText = false
            ds.color = Color.parseColor("#FF0000")
        }
    }

    fun setSpan(spannableString: SpannableString, fullText: String) {
        val indexOf = fullText.indexOf(text)
        spannableString.setSpan(
            clickableSpan,
            indexOf,
            indexOf + text.length,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }
}