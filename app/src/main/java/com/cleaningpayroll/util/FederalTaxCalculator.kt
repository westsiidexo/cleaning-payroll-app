package com.cleaningpayroll.util

object FederalTaxCalculator {
    // Placeholder function, you should customize for specific brackets/fica
    fun calculateFederalWithholding(grossPay: Double): Double {
        return grossPay * 0.12 // Example flat percentage
    }

    fun calculateFica(grossPay: Double): Double {
        val ssRate = 0.062 // Social Security
        val medicareRate = 0.0145 // Medicare
        return grossPay * (ssRate + medicareRate)
    }
}