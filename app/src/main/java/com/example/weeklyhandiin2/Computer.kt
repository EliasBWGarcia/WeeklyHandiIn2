package com.example.weeklyhandiin2

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Year

open class Computer(val model: String, val serialNumber: Long, private val yearOfRelease: Int) {

    open fun displayDetails() {
        println("Model: $model, Serial Number: $serialNumber.")
    }

    @RequiresApi(Build.VERSION_CODES.O) // Bruges til at finde det nuværende årstal. Hvis man kører en ældre version af Android (før API 26), v// Bruges til at finde det nuværende årstal. Hvis man kører en ældre version af Android (før API 26), vil dette dog ikke virke - https://stackoverflow.com/questions/41356279/how-to-get-current-year-in-android
    open fun displayAgeOfModel() {
        val currentYear: Int = Year.now().value
        val ageOfModel: Int = currentYear - yearOfRelease
        if (ageOfModel == 1) {
            println("The current age of the $model is: $ageOfModel year")
        } else
            println("The current age of the $model is: $ageOfModel years")
    }
}


