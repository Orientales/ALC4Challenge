package com.qaasim.alc40phase1

import android.net.http.SslError
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_about_alc.*

class AboutALC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)

        //about_alc_webview is the webview where the url will be loaded to
        about_alc_webview!!.webViewClient = object : WebViewClient() {
            //handling SSLError leading to blank screen (due to the https protocol)
            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler!!.proceed()
            }
        }

        //this loads the passed in url into the webview in activity_about_alc
        //@param about_alc_webview is the webview (container) for the below url
        about_alc_webview.loadUrl("https://andela.com/alc")
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