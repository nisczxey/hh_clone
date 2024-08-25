package com.example.data.model


import com.google.gson.annotations.SerializedName

data class Offer(
    @SerializedName("button")
    val button: Button,
    @SerializedName("id")
    val id: String,
    @SerializedName("link")
    val link: String,
    @SerializedName("title")
    val title: String
)