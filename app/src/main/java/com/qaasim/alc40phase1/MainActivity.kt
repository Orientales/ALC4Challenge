package com.qaasim.alc40phase1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about_alc.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //handles what happens when the about_btn  is clicked (launches activity_about_alc)
        about_btn.setOnClickListener { _ -> startActivity(Intent(this, AboutALC::class.java)) }
        //handles what happens when the profile_btn  is clicked (launches activity_my_profile)
        profile_btn.setOnClickListener{ _ -> startActivity(Intent(this, MyProfile::class.java))}
    }
}
