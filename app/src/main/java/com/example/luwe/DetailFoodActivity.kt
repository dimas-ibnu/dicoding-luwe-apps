package com.example.luwe

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailFoodActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_IMG = "extra_img"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_food_activity)

        val name = intent.getStringExtra(EXTRA_NAME)
        val price = intent.getIntExtra(EXTRA_PRICE, 0)
        val desc = intent.getStringExtra(EXTRA_DESC)
        val img = intent.getIntExtra(EXTRA_IMG, 0)

        val tvName: TextView = findViewById(R.id.tv_detail_name)
        val tvPrice: TextView = findViewById(R.id.tv_detail_price)
        val tvDesc: TextView = findViewById(R.id.tv_detail_desc)
        val ivImg: ImageView = findViewById(R.id.iv_detail_img)

        val btnShare: Button = findViewById(R.id.btn_share)
        val btnFav: Button = findViewById(R.id.btn_fav)
        val actionbar = supportActionBar


        tvName.text = name
        tvPrice.text = "Rp.$price"
        tvDesc.text = desc
        ivImg.setImageResource(img)


        actionbar?.title = name

        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)

        btnFav.setOnClickListener {
            Toast.makeText(this, "Menambahkan $name ke Favorit", Toast.LENGTH_SHORT).show()
        }

        btnShare.setOnClickListener {
            Toast.makeText(this, "Membagikan $name", Toast.LENGTH_SHORT).show()
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
    return true
    }

}