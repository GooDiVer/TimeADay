package database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MyTaskDatabaseDao {
    @Insert
    fun insert(myTask: MyTask)

    @Update
    fun update(myTask: MyTask)

    @Query("SELECT * FROM mytasks_table WHERE taskId = :key")
    fun get(key: Long): MyTask?

    @Query("SELECT * FROM mytasks_table")
    fun getAllTasks(): LiveData<List<MyTask>>
}