package fr.isen.allegretti.androidcontactds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailContact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_contact)

        val actionBar = supportActionBar
        actionBar!!.title = "DroitRestaurant"
    }
}