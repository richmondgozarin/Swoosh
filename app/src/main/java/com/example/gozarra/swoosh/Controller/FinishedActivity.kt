package com.example.gozarra.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.gozarra.swoosh.R
import com.example.gozarra.swoosh.Utilities.EXTRA_LEAGUE
import com.example.gozarra.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finished.*

class FinishedActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finished)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}
