package com.catnip.cowboyshoot.ui.option

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.catnip.cowboyshoot.R
import com.catnip.cowboyshoot.databinding.ActivityOptionBinding

class OptionActivity : AppCompatActivity() {
    private val binding: ActivityOptionBinding by lazy {
        ActivityOptionBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
        val stringExtra = intent.getStringExtra("NAME")
        binding.tvTitle.text = String.format(getString(R.string.title_option), stringExtra)
    }
}