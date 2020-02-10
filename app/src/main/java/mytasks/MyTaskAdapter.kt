package mytasks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.timeaday.databinding.ListMyTaskItemBinding
import database.MyTask

class MyTaskAdapter() : ListAdapter<MyTask, MyTaskAdapter.ViewHolder>(MyTaskDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }


    class ViewHolder private constructor(val binding: ListMyTaskItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: MyTask) {
            binding.mystask = item
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                val binding = ListMyTaskItemBinding.inflate(inflater, parent, false)
                return ViewHolder(binding)
            }
        }

    }



}
class MyTaskDiffCallback : DiffUtil.ItemCallback<MyTask>() {
    override fun areItemsTheSame(oldItem: MyTask, newItem: MyTask): Boolean {
        return oldItem.taskId == newItem.taskId
    }

    override fun areContentsTheSame(oldItem: MyTask, newItem: MyTask): Boolean {
        return oldItem == newItem
    }
}

