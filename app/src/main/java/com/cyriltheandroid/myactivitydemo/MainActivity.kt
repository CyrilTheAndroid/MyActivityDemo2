package com.cyriltheandroid.myactivitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private var randomInt = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate()")

        textView = findViewById(R.id.text_view)
        randomInt = savedInstanceState?.getInt("random_int") ?: getRandomInt()
        textView.text = randomInt.toString()

        val button = findViewById<Button>(R.id.next_button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MainActivity", "onSaveInstanceState()")
        outState.putInt("random_int", randomInt)
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy()")
    }

    private fun getRandomInt() = Random().nextInt()
}