package com.example.android.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        search.setOnClickListener {this@MainActivity }

        wview.settings.javaScriptEnabled=true
        wview.settings.builtInZoomControls=true

    }//oncreate

    override
    fun onClick(v: View) {
        if (v!=null)
        when (v.id) {
            R.id.search -> {
                if (et1.text.toString().startsWith("http;//", false)) {
                    wview.loadUrl(et1.text.toString())
                } else
                    wview.loadUrl("http://" + et1.text.toString())
            }

            R.id.fb -> {
                wview.loadUrl("http://www.facebook.com")
            }
            R.id.youtube -> {
                wview.loadUrl("http://www.youtube.com")
            }
            R.id.twitter -> {
                wview.loadUrl("http://www.twitter.com")
            }
            R.id.dropbox -> {
                wview.loadUrl("http://www.dropbox.com")
            }
        }//when
    }//onclick

}