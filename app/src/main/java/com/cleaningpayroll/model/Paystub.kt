package com.cleaningpayroll.model
import java.util.Date

data class Paystub(
    val id: Int = 0,
    val employeeId: Int,
    val periodStart: Date,
    val periodEnd: Date,
    val grossPay: Double,
    val federalTax: Double,
    val ficaTax: Double,
    val indianaTax: Double,
    val netPay: Double
)