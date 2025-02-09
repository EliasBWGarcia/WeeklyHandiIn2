package com.example.weeklyhandiin2

class Laptop(model: String, serialNumber: Long, yearOfRelease: Int, var bluetoothStatus: Boolean): Computer(model, serialNumber, yearOfRelease) {
    override fun displayAgeOfModel() {
        super.displayAgeOfModel()
    }

    override fun displayDetails() {
        super.displayDetails()
    }

    fun isBluetoothOn() {
        println("Is Bluetooth on: $bluetoothStatus")
    }

}