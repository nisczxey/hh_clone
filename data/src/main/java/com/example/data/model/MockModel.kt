package com.example.data.model


import com.google.gson.annotations.SerializedName

data class MockModel(
    @SerializedName("offers")
    val offers: List<Offer>,
    @SerializedName("vacancies")
    val vacancies: List<Vacancy>
)