package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

private const val TAG = "MainActivity"
private const val MY_OWN_LOG_TAG = "MyOwnLog"
private const val VALUE = "Value"


class MainActivity : AppCompatActivity() {
    private lateinit var helloTextView: TextView
    private lateinit var randomizeButton: Button
    private var stroka1 = "1  Ты видел деву на скале"
    private var stroka2 = "2  В одежде белой над волнами"
    private var stroka3 = "3  Когда, бушуя в бурной мгле,"
    private var stroka4 = "4  Играло море с берегами,"
    private var stroka5 = "5  Когда луч молний озарял"
    private var stroka6 = "6  Ее всечасно блеском алым"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById(R.id.hello_text_view)
        randomizeButton = findViewById(R.id.randomize_button)
        randomizeButton.setOnClickListener { randomize() }

        if (savedInstanceState != null) {
            helloTextView.text = savedInstanceState.getString(VALUE)
            stroka1 = savedInstanceState.getString("stroka7").toString()
            stroka2 = savedInstanceState.getString("stroka8").toString()
            stroka3 = savedInstanceState.getString("stroka9").toString()
            stroka4 = savedInstanceState.getString("stroka10").toString()
            stroka5 = savedInstanceState.getString("stroka11").toString()
            stroka6 = savedInstanceState.getString("stroka12").toString()
        }
        else randomize()

        Log.d(MY_OWN_LOG_TAG,stroka1)

    }

    private fun randomize() {
        helloTextView.text = Random.nextInt(100).toString()
       // Log.d(MY_OWN_LOG_TAG,"Randomize")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_OWN_LOG_TAG,stroka2)
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_LOG_TAG,stroka3)
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_LOG_TAG,stroka4)
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_LOG_TAG,stroka5)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MY_OWN_LOG_TAG,"77")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_LOG_TAG,stroka6)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(VALUE, helloTextView.text.toString())
        outState.putString("stroka7","7  И ветер бился и летал")
        outState.putString("stroka8","8  С ее летучим покрывалом?")
        outState.putString("stroka9","9  Прекрасно море в бурной мгле")
        outState.putString("stroka10","10 И небо в блесках без лазури;")
        outState.putString("stroka11","11 Но верь мне: дева на скале")
        outState.putString("stroka12","12 Прекрасней волн, небес и бури.")

    }

}


