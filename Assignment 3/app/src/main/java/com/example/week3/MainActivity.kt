package com.example.week3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var amazon : ImageButton
    private lateinit var youtube : ImageButton
    private lateinit var instagram : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amazon = findViewById(R.id.flipcart)
        youtube = findViewById(R.id.google)
        instagram = findViewById(R.id.instagram)

        amazon.setOnClickListener {
            gotoUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26linkCode%3Dll2%26tag%3Doperagx-desktop-in-21%26linkId%3Df9dfa554c004a3f025d93f062dec5ec6%26language%3Den_IN%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0")

        }

        youtube.setOnClickListener {
            gotoUrl("https://www.youtube.com")
        }

        instagram.setOnClickListener {
            gotoUrl("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2Faccounts%2Fonetap%2F%3Fnext%3D%252F%26__coig_login%3D1")
        }
    }

    private fun gotoUrl(s: String) {
        val i= Intent(Intent.ACTION_VIEW, Uri.parse(s))
        startActivity(i)

    }

}