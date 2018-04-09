package it.informarecomunicare.netflixhelper

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val movieList = arrayListOf("The Fundamentals of Caring", "When We First Met", "Bright", "Beasts of No Nation", "Okja", "To the Bone", "Spectral")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        suggestMovieBtn.setOnClickListener {
            movieTitleTxt.setTextSize(30F) // change size of TextBox to show Movie Name
            val random = Random()
            val randomMovie = random.nextInt(movieList.count())
            movieTitleTxt.text = movieList[randomMovie]
        }

        addMovieBtn.setOnClickListener {
            val newMovie = addMovieTxt.text.toString()
            movieList.add(newMovie) // add just added movie to ArrayList
            addMovieTxt.text.clear() // clear EditText field
            println(movieList) // print in logcat ALL MOVIES in ArrayList
        }
    }
}
