package fr.isen.allegretti.androidcontactds

import com.google.gson.annotations.SerializedName


data class Model (

  @SerializedName("results" ) var results : ArrayList<Results> = arrayListOf(),
  @SerializedName("info"    ) var info    : Info?              = Info()

)