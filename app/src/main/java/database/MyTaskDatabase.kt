package database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MyTask::class], version = 1, exportSchema = false)
abstract class MyTaskDatabase : RoomDatabase() {

}