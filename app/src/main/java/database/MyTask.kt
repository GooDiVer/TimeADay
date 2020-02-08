package database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mytasks_table")
data class MyTask (
    @PrimaryKey(autoGenerate = true)
    var taskId: Long = 0L,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "clear_action_time")
    val clearActionTime: Long,

    @ColumnInfo(name = "prepare_time")
    val prepareTime: Long
)