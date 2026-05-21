package com.cleaningpayroll.util

object IndianaTaxCalculator {
    private const val IN_STATE_RATE = 0.0315 // 3.15% as of 2024
    
    fun calculateIndianaTax(grossPay: Double): Double {
        return grossPay * IN_STATE_RATE
    }
}