package com.cnm.fragmentcaseconverter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_first, firstFragment)
            replace(R.id.fl_second, secondFragment, "second")
        }.commit()
    }

    fun submit(text: String) {
        val fragment = supportFragmentManager.findFragmentByTag("second") as SecondFragment
        fragment.submit(text)
    }
}
