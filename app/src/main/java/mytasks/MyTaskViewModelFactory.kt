package mytasks

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import database.MyTaskDatabaseDao
import java.lang.IllegalArgumentException


class MyTaskViewModelFactory(
    private val dataSource: MyTaskDatabaseDao,
    private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyTaskViewModel::class.java)) {
            return MyTaskViewModel(dataSource, application) as T
        }
        else {
            throw IllegalArgumentException("Unknown ViewModel type")
        }
    }
}