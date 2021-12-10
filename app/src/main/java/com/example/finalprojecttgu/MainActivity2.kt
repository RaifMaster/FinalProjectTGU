package com.example.finalprojecttgu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    var  btnActOne: Button? = null

    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnActOne = findViewById<View>(R.id.backbtn) as Button
        btnActOne!!.setOnClickListener(this)
        supportActionBar?.hide();
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.backbtn -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)}
            else -> {}
        }
    }
}