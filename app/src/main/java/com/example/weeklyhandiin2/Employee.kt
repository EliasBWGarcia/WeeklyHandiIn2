package com.example.weeklyhandiin2

class Employee(val firstName: String, val lastName: String, private var monthlySalary: Double) {
    init {
        if (monthlySalary < 0.0) {
            monthlySalary = 0.0
        }
    }

    val yearlySalary: String
        get() = "Yearly salary for ${this} is: \$${monthlySalary * 12}"

    val yearlySalaryTenPercentRaise: Double = (monthlySalary * 12) * 1.10;

    fun displayRaise() {
        println("Yearly salary with a ten percent raise for ${this} is: \$$yearlySalaryTenPercentRaise in total")
    }

    override fun toString(): String {
        return "Employee(firstName='$firstName', lastName='$lastName', monthlySalary=\$$monthlySalary)"
    }
}