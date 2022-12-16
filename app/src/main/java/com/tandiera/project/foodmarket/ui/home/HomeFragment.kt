package com.tandiera.project.foodmarket.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tandiera.project.foodmarket.databinding.FragmentHomeBinding
import com.tandiera.project.foodmarket.model.dummy.HomeModel

class HomeFragment : Fragment(), HomeAdapter.ItemAdapterCallback{

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private var foodList : ArrayList<HomeModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = HomeAdapter(foodList.this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rvList.layoutManager = layoutManager
        binding.rvList.adapter = adapter
    }

    fun initDataDummy() {
        foodList = ArrayList()
        foodList.add(HomeModel("Cherry Healthy", "", 5f))
        foodList.add(HomeModel("Burger Tamayo", "", 4f))
        foodList.add(HomeModel("Alpokat Kocok", "", 4.8f))
    }

    override fun onClick(v: View, data: HomeModel) {
        TODO("Not yet implemented")
    }
}