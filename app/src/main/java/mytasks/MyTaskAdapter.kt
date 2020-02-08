package mytasks

import androidx.recyclerview.widget.DiffUtil
import database.MyTask

class MyTaskAdapter {

}
class MyTaskDiffCallback : DiffUtil.ItemCallback<MyTask>() {
    override fun areItemsTheSame(oldItem: MyTask, newItem: MyTask): Boolean {
        return oldItem.taskId == newItem.taskId
    }

    override fun areContentsTheSame(oldItem: MyTask, newItem: MyTask): Boolean {
        return oldItem == newItem
    }
}