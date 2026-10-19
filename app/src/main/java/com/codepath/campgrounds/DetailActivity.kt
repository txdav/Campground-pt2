
package com.codepath.campgrounds

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "CampgroundDetailActivity"
const val CAMPGROUND_EXTRA = "CAMPGROUND_EXTRA"

class DetailActivity : AppCompatActivity() {
    private lateinit var campgroundNameTV: TextView
    private lateinit var campgroundDescriptionTV: TextView
    private lateinit var campgroundLatLongTV: TextView
    private lateinit var campgroundImageIV: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Find the views
        campgroundNameTV = findViewById(R.id.campgroundName)
        campgroundDescriptionTV = findViewById(R.id.campgroundDescription)
        campgroundLatLongTV = findViewById(R.id.campgroundLocation)
        campgroundImageIV = findViewById(R.id.campgroundImage)
        findViewById<android.widget.Button>(R.id.backButton).setOnClickListener {
            finish()
        }

        // Get the campground passed from MainActivity
        val campground =
            intent.getSerializableExtra(CAMPGROUND_EXTRA) as? Campground

        // Display the campground information
        if (campground != null) {
            campgroundNameTV.text = campground.name.orEmpty()
            campgroundDescriptionTV.text = campground.description.orEmpty()
            campgroundLatLongTV.text = campground.latLong.orEmpty()

            // Load the campground image
            Glide.with(this)
                .load(campground.imageUrl)
                .into(campgroundImageIV)
        }
    }
}