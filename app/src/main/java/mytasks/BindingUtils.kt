package mytasks

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.databinding.BindingAdapter
import database.MyTask
import org.w3c.dom.Text

@BindingAdapter("titleTextView")
fun TextView.setTitle(myTask: MyTask) {
    myTask?.let {
        text = myTask.title
    }
}

@SuppressLint("SetTextI18n")
@BindingAdapter("clearActionNumericTime")
fun TextView.setClearTime(myTask: MyTask) {
    myTask?.let {
        text = "${(myTask.clearActionTime / 3600000)}ч"
    }
}

@SuppressLint("SetTextI18n")
@BindingAdapter("prepareNumericTime")
fun TextView.setPrepareTime(myTask: MyTask) {
        text = "${(myTask.prepareTime / 60000)}мин"
}