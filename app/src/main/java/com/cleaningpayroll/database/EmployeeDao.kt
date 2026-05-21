package com.cleaningpayroll.database

import androidx.room.*
import com.cleaningpayroll.model.Employee

@Dao
interface EmployeeDao {
    @Query("SELECT * FROM employee WHERE isActive=1")
    fun getActiveEmployees(): List<Employee>

    @Insert
    fun insert(employee: Employee)

    @Update
    fun update(employee: Employee)

    @Delete
    fun delete(employee: Employee)
}
