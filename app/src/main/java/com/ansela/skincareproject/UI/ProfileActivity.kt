package com.ansela.skincareproject.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ImageView
import android.widget.TextView
import com.ansela.skincareproject.R

class ProfileActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PHOTO = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_LOKASI = "extra_lokasi"


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val ProfileReceived: ImageView = findViewById(R.id.iv_user_profile)
        val EmailReceived: TextView = findViewById(R.id.tv_email)
        val AlamatReceived: TextView = findViewById(R.id.tv_user_alamat)

        val photo = intent.getIntExtra(EXTRA_PHOTO,0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val lokasi = intent.getStringExtra(EXTRA_LOKASI)

        ProfileReceived.setImageResource(photo)
        EmailReceived.text = name
        EmailReceived.text = email
        AlamatReceived.text = lokasi
    }
}