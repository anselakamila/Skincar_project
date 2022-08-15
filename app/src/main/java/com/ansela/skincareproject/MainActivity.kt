package com.ansela.skincareproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ansela.skincareproject.UI.DetailSkincareActivity
import com.ansela.skincareproject.UI.ListSkincareAdapter
import com.ansela.skincareproject.UI.ProfileActivity
import com.ansela.skincareproject.data.SkincareData
import com.ansela.skincareproject.data.SkincareDataObject

class MainActivity : AppCompatActivity() {
    private lateinit var rvSkincare: RecyclerView
    private var list: ArrayList<SkincareData> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSkincare = findViewById(R.id.rv_skincare)
        rvSkincare.setHasFixedSize(true)
        list.addAll(SkincareDataObject.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvSkincare.layoutManager = LinearLayoutManager(this)
        val listSkincareAdapter = ListSkincareAdapter(list)
        rvSkincare.adapter = listSkincareAdapter

        listSkincareAdapter.setOnItemClickCallback(object :
            ListSkincareAdapter.OnItemClickCallback {
            override fun onItemClickedData(data: SkincareData) {
                howSelectedSkincare(data)
            }

        })
    }

    private fun howSelectedSkincare(data: SkincareData) {
        val detailSkincareActivity =
            Intent(this@MainActivity, DetailSkincareActivity::class.java).apply {
                putExtra(DetailSkincareActivity.EXTRA_PHOTO, data.photo)
                putExtra(DetailSkincareActivity.EXTRA_NAME, data.nama)
                putExtra(DetailSkincareActivity.EXTRA_HARGA, data.harga)
                putExtra(DetailSkincareActivity.EXTRA_MANFAAT, data.manfaat)


            }
        startActivity(detailSkincareActivity)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        R.id.action_user; run {
            val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
            moveIntent.putExtra(ProfileActivity.EXTRA_PHOTO, R.drawable.profile2)
            moveIntent.putExtra(ProfileActivity.EXTRA_NAME, "ansela")
            moveIntent.putExtra(ProfileActivity.EXTRA_EMAIL, "anselakamila@gmail.com")
            moveIntent.putExtra(ProfileActivity.EXTRA_LOKASI, "Bogor,Jonggol")
            startActivity(moveIntent)
        }

        }
    }

