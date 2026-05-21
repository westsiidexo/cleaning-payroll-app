package com.cleaningpayroll.model

data class Employee(
    val id: Int = 0,
    val name: String,
    val hourlyRate: Double,
    val federalWithholding: Double,
    val indianaWithholding: Double,
    val ssn: String,
    val isActive: Boolean = true
)