package database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [MyTask::class], version = 1, exportSchema = false)
abstract class MyTaskDatabase : RoomDatabase() {
    abstract val databaseDao: MyTaskDatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: MyTaskDatabase? = null

        fun getInstance(context: Context): MyTaskDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if(instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MyTaskDatabase::class.java,
                        "my_tasks_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
                INSTANCE = instance
                return instance
            }
        }
    }

}