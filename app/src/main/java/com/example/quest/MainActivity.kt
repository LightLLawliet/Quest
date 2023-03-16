package com.example.quest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quest.databinding.ActivityMainBinding
import com.google.gson.Gson

class MainActivity : AppCompatActivity(), ActionCallback {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val textView = binding.textView
        setContentView(binding.root)
        viewModel = MainViewModel(
            Repository.Base(this, ReadRawResource.Base(applicationContext), Gson())
        )

        viewModel.liveData.observe(this) {
            it.show(textView)
        }

        viewModel.nextScreen("1")
    }

    override fun moveToScreen(id: String) {
        viewModel.nextScreen(id)
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
