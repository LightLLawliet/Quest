package com.example.quest

import android.os.Bundle
import android.text.SpannableString
import android.text.style.ClickableSpan
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.quest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val textView = binding.textView
        val awakening = getString(R.string.awakening)
        val awakeningActionFirst = getString(R.string.awakening_action_first)
        val awakeningActionSecond = getString(R.string.awakening_action_second)
        val spannableString = SpannableString(awakening)

        val awakeningActionFirstClickSpan = object : ClickableSpan() {
            override fun onClick(widget: View) {
                //todo move to screen two
            }
        }
        setContentView(binding.root)
    }
}