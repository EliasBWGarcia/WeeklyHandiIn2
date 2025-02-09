package com.example.weeklyhandiin2

// Junior Developer

/*
// Parent class: Shape
abstract class Shape(val color: String, val isTransparent: Boolean) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

// Circle class
class Circle(color: String, isTransparent: Boolean, private val radius: Double) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

// Triangle class
class Triangle(color: String, isTransparent: Boolean, private val sideA: Double, private val sideB: Double, private val sideC: Double) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2  // Semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}

fun main() {
    val circle = Circle("Red", false, 5.0)
    println("Circle: Perimeter = ${circle.calculatePerimeter()}, Area = ${circle.calculateArea()}")

    val triangle = Triangle("Blue", true, 3.0, 4.0, 5.0)
    println("Triangle: Perimeter = ${triangle.calculatePerimeter()}, Area = ${triangle.calculateArea()}")
}


//Senior developer

// Parent class: Shape
abstract class Shape(val color: String, val isTransparent: Boolean) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double

    protected fun validatePositive(value: Double, attributeName: String) {
        require(value > 0) { "$attributeName must be positive. Provided: $value" }
    }
}

// Circle class
class Circle(color: String, isTransparent: Boolean, private val radius: Double) : Shape(color, isTransparent) {
    init {
        validatePositive(radius, "Radius")
    }

    override fun calculatePerimeter(): Double = 2 * Math.PI * radius

    override fun calculateArea(): Double = Math.PI * radius * radius
}

// Triangle class
class Triangle(color: String, isTransparent: Boolean, private val sideA: Double, private val sideB: Double, private val sideC: Double) : Shape(color, isTransparent) {
    init {
        validatePositive(sideA, "Side A")
        validatePositive(sideB, "Side B")
        validatePositive(sideC, "Side C")
        require(isValidTriangle()) { "The provided sides do not form a valid triangle." }
    }

    override fun calculatePerimeter(): Double = sideA + sideB + sideC

    override fun calculateArea(): Double {
        val s = calculatePerimeter() / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    private fun isValidTriangle(): Boolean {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA
    }
}

fun main() {
    try {
        val circle = Circle("Red", false, 5.0)
        println("Circle: Perimeter = ${circle.calculatePerimeter()}, Area = ${circle.calculateArea()}")

        val triangle = Triangle("Blue", true, 3.0, 4.0, 5.0)
        println("Triangle: Perimeter = ${triangle.calculatePerimeter()}, Area = ${triangle.calculateArea()}")

        // Uncomment this to see validation in action
        // val invalidTriangle = Triangle("Green", false, 1.0, 2.0, 10.0)
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}
*/