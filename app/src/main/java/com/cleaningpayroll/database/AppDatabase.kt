package com.cleaningpayroll.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cleaningpayroll.model.Employee
import com.cleaningpayroll.model.WorkEntry
import com.cleaningpayroll.model.Paystub

@Database(entities = [Employee::class, WorkEntry::class, Paystub::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun employeeDao(): EmployeeDao
    abstract fun workEntryDao(): WorkEntryDao
    abstract fun paystubDao(): PaystubDao
}
