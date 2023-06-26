package com.example.lab_1

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {

    companion object {
        const val ANIMAL_NAME = "ANIMAL_NAME"
        const val ANIMAL_SLOGAN = "ANIMAL_SLOGAN"
        const val ANIMAL_LONG_DESCRIPTION = "ANIMAL_LONG_DESCRIPTION"
        const val ANIMAL_RES = "ANIMAL_RES"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val animalName = intent.getStringExtra(ANIMAL_NAME)
        val animalSlogan = intent.getStringExtra(ANIMAL_SLOGAN)
        val animalLongDescription = intent.getStringExtra(ANIMAL_LONG_DESCRIPTION)
        val animalImageRes = intent.getIntExtra(ANIMAL_RES, -1)

        findViewById<TextView>(R.id.nameTextView).text = animalName
        findViewById<TextView>(R.id.sloganTextView).text = animalSlogan
        findViewById<TextView>(R.id.descriptionTextView).text = animalLongDescription
        findViewById<ImageView>(R.id.imageView).setImageResource(animalImageRes)

    }
}