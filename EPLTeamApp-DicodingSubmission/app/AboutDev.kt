package com.gna.eplteamapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_dev)
        val actionbar = supportActionBar
        actionbar!!.title = "About Me"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvAboutName: TextView = findViewById(R.id.about_name)
        val tvAboutEmail: TextView = findViewById(R.id.about_email)
        val tvAboutPhoto: de.hdodenhof.circleimageview.CircleImageView = findViewById(R.id.about_photo)
    }
}