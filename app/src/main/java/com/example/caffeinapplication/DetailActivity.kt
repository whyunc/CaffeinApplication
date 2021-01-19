package com.example.caffeinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        //const val EXTRA_PHOTO = "extra_photo"
       //const val EXTRA_TITLE = "extra_title"
        //const val EXTRA_TIME = "extra_time"
        //const val EXTRA_TYPE = "extra_type"
        //const val EXTRA_DETAIL = "extra_detail"
        //const val EXTRA_INGREDIENTS = "extra_ingredients"
        //const val EXTRA_STEPS = "extra_steps"

        const val EXTRA_COFFEE = "extra_coffee"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = "Detail Coffee"

        val TvDetailImg: ImageView = findViewById(R.id.tv_DetailIMG)
        val DetailTitle: TextView = findViewById(R.id.detail_title)
        val DetailTime: TextView = findViewById(R.id.detail_time)
        val DetailType: TextView = findViewById(R.id.detail_type)
        val DetailDetail: TextView = findViewById(R.id.detail_detail)
        val DetailIngredients: TextView = findViewById(R.id.detail_ingredients)
        val DetailSteps: TextView = findViewById(R.id.detail_steps)

        //val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        //val title = intent.getStringExtra(EXTRA_TITLE)
        //val time = intent.getStringExtra(EXTRA_TIME)
        //val type = intent.getStringExtra(EXTRA_TYPE)
        //val detail = intent.getStringExtra(EXTRA_DETAIL)
        //val ingredients = intent.getStringExtra(EXTRA_INGREDIENTS)
        //val steps = intent.getStringExtra(EXTRA_STEPS)
            // PARCELABLE IMPLEMENTATION
        val coffee = intent.getParcelableExtra<Coffee>(EXTRA_COFFEE) as Coffee

        Glide.with(this)
            .load(coffee.photo)
            .apply(RequestOptions())
            .into(TvDetailImg)
        DetailTitle.text = coffee.title
        DetailTime.text = coffee.time
        DetailType.text = coffee.type
        DetailDetail.text = coffee.detail
        DetailIngredients.text = coffee.ingredients
        DetailSteps.text = coffee.steps
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}