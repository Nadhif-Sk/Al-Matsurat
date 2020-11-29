package com.example.almatsurot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dzikir_pagi.*

class DzikirPagi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_pagi)

        viewpage_main.adapter = DoaAdapter(supportFragmentManager)
    }
}

