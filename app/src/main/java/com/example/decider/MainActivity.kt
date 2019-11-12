package com.example.decider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val disneyList = arrayListOf("Peter Pan", "Tinker Bell", "Star Wars")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DecideBtn.setOnClickListener{
            val random = Random()
            val randomDisney = random.nextInt(disneyList.count())
            selectedDisneyTxt.text = disneyList[randomDisney]
        }

        addMovieBtn.setOnClickListener {
            val newMovie = addDisneyTxt.text.toString()
            disneyList.add(newMovie)
            addDisneyTxt.text.clear()
            println(disneyList)
        }
    }
}
