package com.vitpunerobotics.netra.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView
import com.vitpunerobotics.netra.R
import com.vitpunerobotics.netra.global_variables

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var voicebt = findViewById<CardView>(R.id.voice)
        var facebt = findViewById<CardView>(R.id.face)
        var colorbt = findViewById<CardView>(R.id.filter)
        var ocrbt = findViewById<CardView>(R.id.ocr)
        var movebt = findViewById<CardView>(R.id.move)
        var manual = findViewById<CardView>(R.id.manual)
        manual.setOnClickListener(View.OnClickListener {
            val bluetooth_intend = Intent(applicationContext, ManualControlActivity::class.java)

            startActivity(bluetooth_intend)
        })
        voicebt.setOnClickListener(View.OnClickListener {
            setContentView(R.layout.activity_home)
            val Open_Voice = Intent(applicationContext, VoiceControlActivity::class.java)
            startActivity(Open_Voice)
        })
        facebt.setOnClickListener(View.OnClickListener {
            val Open_Face_Tracker = Intent(applicationContext, FaceTrackerActivity::class.java)
            startActivity(Open_Face_Tracker)
        })
        colorbt.setOnClickListener(View.OnClickListener {
            val Open_Color = Intent(applicationContext, ColorDetectionActivity::class.java)
            startActivity(Open_Color)
        })
        ocrbt.setOnClickListener(View.OnClickListener {
            val Open_Ocr = Intent(applicationContext, OCRActivity::class.java)
            startActivity(Open_Ocr)
        })
        movebt.setOnClickListener(View.OnClickListener {
            val Open_move = Intent(applicationContext, Move_dist::class.java)
            startActivity(Open_move)
        })
    }
}