package addmytasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.timeaday.R
import com.example.timeaday.databinding.FragmentAddToTasksBinding
import com.example.timeaday.databinding.FragmentMyTasksBinding

class AddToTasksFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentAddToTasksBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_to_tasks, container, false)

        val viewModel = ViewModelProviders.of(this).get(AddToTasksViewModel::class.java)

        binding.addToTasksViewModel = viewModel

        return binding.root
    }
}