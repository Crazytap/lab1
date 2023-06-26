package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val listOfAnimals = listOf(
        Animal(
            "Axolotl",
            "The smiling salamander",
            "The axolotl is a critically endangered amphibian native to Mexico. It has become famous for its unique appearance and regenerative abilities.",
            R.drawable.img
        ),
        Animal(
            "Vaquita",
            "The world's rarest marine mammal",
            "The vaquita is a small porpoise that is on the brink of extinction. It is endemic to the Gulf of California and faces numerous threats, primarily due to fishing practices.",
            R.drawable.img_1
        ),
        Animal(
            "Javan Rhino",
            "The unicorn of Asia",
            "The Javan Rhino is one of the rarest large mammals in the world. It is found in Indonesia and is critically endangered due to habitat loss and poaching.",
            R.drawable.img_2
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.detailsButton1.setOnClickListener {
            openDetailsScreen(listOfAnimals[0])
        }
        binding.detailsButton2.setOnClickListener {
            openDetailsScreen(listOfAnimals[1])
        }
        binding.detailsButton3.setOnClickListener {
            openDetailsScreen(listOfAnimals[2])
        }
    }

    private fun openDetailsScreen(animal: Animal) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(DetailsActivity.ANIMAL_NAME, animal.name)
        intent.putExtra(DetailsActivity.ANIMAL_SLOGAN, animal.slogan)
        intent.putExtra(DetailsActivity.ANIMAL_LONG_DESCRIPTION, animal.longDescription)
        intent.putExtra(DetailsActivity.ANIMAL_RES, animal.imageRes)
        startActivity(intent)
    }
}