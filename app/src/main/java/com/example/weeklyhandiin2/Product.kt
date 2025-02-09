package com.example.weeklyhandiin2

open class Product(var name: String, var price: Double, var quantity: Int) {

    open fun identifyProductCategory() {
        println("I am a -whatever- category")
    }
}