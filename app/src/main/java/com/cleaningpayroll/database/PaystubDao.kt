package com.cleaningpayroll.database

import androidx.room.*
import com.cleaningpayroll.model.Paystub

@Dao
interface PaystubDao {
    @Query("SELECT * FROM paystub WHERE employeeId = :empId")
    fun getPaystubsForEmployee(empId: Int): List<Paystub>

    @Insert
    fun insert(paystub: Paystub)
}
