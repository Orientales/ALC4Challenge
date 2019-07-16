package com.qaasim.alc40phase1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

class MyProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
        //this is used to enable the back button on the ActionBar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    //handling what happens when the back button on ActionBar is clicked
    //goes back to activity_main (home)
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item!!.itemId == android.R.id.home) {
            finish()
        }
        return true
    }

}
