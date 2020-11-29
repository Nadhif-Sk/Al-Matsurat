package com.example.almatsurot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dzikir_petang.*

class DzikirPetang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_petang)

        viewpage_petang.adapter = AdapterPetang(supportFragmentManager)
    }
}