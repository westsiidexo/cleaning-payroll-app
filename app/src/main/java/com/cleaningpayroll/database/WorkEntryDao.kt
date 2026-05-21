package com.cleaningpayroll.database

import androidx.room.*
import com.cleaningpayroll.model.WorkEntry

@Dao
interface WorkEntryDao {
    @Query("SELECT * FROM workentry WHERE employeeId = :empId")
    fun getEntriesForEmployee(empId: Int): List<WorkEntry>

    @Insert
    fun insert(entry: WorkEntry)
}
