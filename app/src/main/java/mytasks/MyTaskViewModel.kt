package mytasks

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import database.MyTask
import database.MyTaskDatabaseDao

class MyTaskViewModel(val databaseDao: MyTaskDatabaseDao,
                      application: Application) : ViewModel() {

    private val _tasks = MutableLiveData<List<MyTask>>()
    val tasks: LiveData<List<MyTask>>
        get() = _tasks

    init {
        _tasks.value = listOf(
            MyTask(1,"Военная кафедра",8*3600000L, 60000L),
            MyTask(2,"Тренажерный зал",3600000L, 60000L),
            MyTask(3,"Работа",6*3600000L, 60000L),
            MyTask(4,"Медитация",8*3600000L, 60000L),
            MyTask(5,"Учеба",3600000L, 60000L),
            MyTask(6,"Английский",6*3600000L, 60000L),
            MyTask(7,"Чтение",8*3600000L, 60000L)

        )
    }


}