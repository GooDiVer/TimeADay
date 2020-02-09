package mytasks

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.timeaday.R
import com.example.timeaday.databinding.FragmentMyTasksBinding
import database.MyTaskDatabase

class MyTaskFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMyTasksBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my_tasks, container, false)

        val application = requireNotNull(this.activity).application

        val databaseDao = MyTaskDatabase.getInstance(application).databaseDao

        val viewModelFactory = MyTaskViewModelFactory(databaseDao, application)

        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(MyTaskViewModel::class.java)

        binding.mtviewmodel = viewModel

        binding.lifecycleOwner = this

        val adapter = MyTaskAdapter()

        binding.myTasksList.adapter = adapter

        viewModel.tasks.observe(viewLifecycleOwner, Observer {
            it?.let {
                adapter.submitList(it)
            }
        })

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.add_menu, menu)
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when(item.itemId) {
//            R.id.add_to_tasks_button -> openAddToTasksFragment()
//        }
//    }

    fun openAddToTasksFragment() {
//        this.findNavController().navigate()
    }

}