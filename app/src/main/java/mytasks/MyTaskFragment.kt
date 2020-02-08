package mytasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.timeaday.R
import com.example.timeaday.databinding.FragmentMyTasksBinding

class MyTaskFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMyTasksBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_tasks, container, false)
        return binding.root
    }

}