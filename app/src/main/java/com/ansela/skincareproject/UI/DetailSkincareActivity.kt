package com.ansela.skincareproject.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.ansela.skincareproject.R

class DetailSkincareActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PHOTO = " extra_photo"
        const val  EXTRA_NAME = "extra_name"
        const val  EXTRA_HARGA = "extra_harga"
        const val  EXTRA_MANFAAT = "extra_manfaat"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_skincare)

        var actionBar = getSupportActionBar()
        actionBar?.setDisplayHomeAsUpEnabled(true)

        showSkincareDetail()
    }

    private fun showSkincareDetail() {
        val tvImageReceived: ImageView = findViewById(R.id.iv_item_photo)
        val tvNameReceived: TextView = findViewById(R.id.tv_item_name)
        val tvHargaReceived: TextView = findViewById(R.id.tv_item_harga)
        val tvManfaatReceived: TextView = findViewById(R.id.tv_item_manfaat)

        val photo = intent.getIntExtra(EXTRA_PHOTO,0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val harga = intent.getStringExtra(EXTRA_HARGA)
        val manfaat = intent.getStringExtra(EXTRA_MANFAAT)

        tvImageReceived.setImageResource(photo)
        tvNameReceived.setText("$name")
        tvHargaReceived.setText("$harga")
        tvManfaatReceived.setText("$manfaat")

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}