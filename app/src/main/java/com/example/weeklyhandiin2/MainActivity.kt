package com.example.weeklyhandiin2

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    // Opgave 1
    val employee1 = Employee("John", "Doe", -10.0)
    println(employee1.yearlySalary)

    val employee2 = Employee("Jane", "Doe", 550.5)
    println(employee2.yearlySalary)


    employee1.displayRaise()
    employee2.displayRaise()

    // Opgave 2

    val iphone15Pro = SmartPhone("Iphone 15 pro", 21981278712, 2023, 10)
    iphone15Pro.displayDetails()
    iphone15Pro.displayAgeOfModel()
    iphone15Pro.showBatteryStatus()

    val macbookAirM3 = Laptop("Macbook Air M3", 12873691867, 2024, true)
    macbookAirM3.displayDetails()
    macbookAirM3.displayAgeOfModel()
    macbookAirM3.isBluetoothOn()

    // Opgave 3

    val treasureIsland = Book("Treasure Island", 200.00, 4)
    treasureIsland.identifyProductCategory()

    val nikeAirMax = Shoe("Nike Air Max", 250.00, 30)
    nikeAirMax.identifyProductCategory()

    val blackTshirt = Tshirt("Polo T-Shirt", 50.00, 25)
    blackTshirt.identifyProductCategory()
}