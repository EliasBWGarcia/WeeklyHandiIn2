package com.example.weeklyhandiin2

class SmartPhone(model: String, serialNumber: Long, yearOfRelease: Int, var batteryLifePercentage: Int): Computer(model, serialNumber, yearOfRelease) {

    override fun displayDetails() {
        super.displayDetails()
    }

    override fun displayAgeOfModel() {
        super.displayAgeOfModel()
    }

    fun showBatteryStatus() {
        if (batteryLifePercentage < 20) {
            println("Low Battery: $batteryLifePercentage%")
        } else println("Battery Life: $batteryLifePercentage%")
    }
}