package com.gna.eplteamapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvTeams: RecyclerView
    private var list: ArrayList<Team> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title = "EPL Team App"

        rvTeams = findViewById(R.id.rv_teams)
        rvTeams.setHasFixedSize(true)

        list.addAll(TeamData.listData)
        showRecyclerCardView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }


    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                showAbout()
            }
        }
    }

    private fun showAbout() {
        val moveIntent = Intent(this@MainActivity, AboutDev::class.java)
        startActivity(moveIntent)
    }

    private fun showRecyclerCardView() {
        rvTeams.layoutManager = LinearLayoutManager(this)
        val cardViewTeamAdapter = CardViewTeamAdapter(list)
        rvTeams.adapter = cardViewTeamAdapter
    }
}