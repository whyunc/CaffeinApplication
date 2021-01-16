package com.example.caffeinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_TIME = "extra_time"
        const val EXTRA_TYPE = "extra_type"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_INGREDIENTS = "extra_ingredients"
        const val EXTRA_STEPS = "extra_steps"
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

        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        val title = intent.getStringExtra(EXTRA_TITLE)
        val time = intent.getStringExtra(EXTRA_TIME)
        val type = intent.getStringExtra(EXTRA_TYPE)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val ingredients = intent.getStringExtra(EXTRA_INGREDIENTS)
        val steps = intent.getStringExtra(EXTRA_STEPS)

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions())
            .into(TvDetailImg)
        DetailTitle.text = title
        DetailTime.text = time
        DetailType.text = type
        DetailDetail.text = detail
        DetailIngredients.text = ingredients
        DetailSteps.text = steps
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}