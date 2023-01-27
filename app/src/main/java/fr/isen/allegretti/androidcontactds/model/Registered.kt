package fr.isen.allegretti.androidcontactds

import com.google.gson.annotations.SerializedName


data class Registered (

  @SerializedName("date" ) var date : String? = null,
  @SerializedName("age"  ) var age  : Int?    = null

)