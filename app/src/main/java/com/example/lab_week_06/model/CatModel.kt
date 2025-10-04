package com.example.lab_week_06.model

enum class CatBreed {
    AmericanCurl, BalineseJavanese, ExoticShorthair
}

enum class Gender {
    Female, Male, Unknown
}

data class CatModel(
    val gender: Gender,
    val breed: CatBreed,
    val name: String,
    val biography: String,
    val imageUrl: String
)