package com.example.weeklyhandiin2

class Shoe(name: String, price: Double, quantity: Int): Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a Shoe")
    }
}