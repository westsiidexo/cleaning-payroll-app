package com.cleaningpayroll.model
import java.util.Date

data class WorkEntry(
    val id: Int = 0,
    val employeeId: Int,
    val date: Date,
    val hoursWorked: Double
)