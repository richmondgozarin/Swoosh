 package com.example.gozarra.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.gozarra.swoosh.Utilities.EXTRA_LEAGUE
import com.example.gozarra.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

 class LeagueActivity : BaseActivity() {

     var selectedLeague: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

     fun onMensClicked(view:View) {
         womensLeagueBtn.isChecked = false
         coedLeagueBtn.isChecked = false
         selectedLeague = "mens"

         selectedLeague = if (mensLeagueBtn.isChecked) {
             "mens"
         } else {
             ""
         }
     }

     fun onWomensClicked(view: View) {
         mensLeagueBtn.isChecked = false
         coedLeagueBtn.isChecked = false

         selectedLeague = if (womensLeagueBtn.isChecked) {
             "womens"
         } else {
             ""
         }

     }

     fun onCoedClicked(view: View) {
         mensLeagueBtn.isChecked = false
         womensLeagueBtn.isChecked = false

         selectedLeague = if (coedLeagueBtn.isChecked) {
             "co-ed"
         } else {
             ""
         }
     }

    fun leagueNextClicked(view: View) {

        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()

        }
    }
}
