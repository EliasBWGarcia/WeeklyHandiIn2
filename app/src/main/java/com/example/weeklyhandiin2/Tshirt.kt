package com.example.weeklyhandiin2

class Tshirt(name: String, price: Double, quantity: Int): Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a T-Shirt")
    }
}