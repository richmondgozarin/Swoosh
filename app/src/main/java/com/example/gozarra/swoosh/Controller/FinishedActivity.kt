package com.example.gozarra.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.gozarra.swoosh.Model.Player
import com.example.gozarra.swoosh.R
import com.example.gozarra.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finished.*

class FinishedActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finished)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
