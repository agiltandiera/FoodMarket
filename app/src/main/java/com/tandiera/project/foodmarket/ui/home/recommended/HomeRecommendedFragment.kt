package com.tandiera.project.foodmarket.ui.home.recommended

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tandiera.project.foodmarket.R
import com.tandiera.project.foodmarket.databinding.FragmentHomeNewTasteBinding
import com.tandiera.project.foodmarket.model.dummy.HomeVerticalModel
import com.tandiera.project.foodmarket.ui.home.newTaste.HomeNewTasteAdapter
import com.tandiera.project.foodmarket.ui.home.newTaste.HomeNewTasteFragment

class HomeRecommendedFragment : Fragment(), HomeNewTasteAdapter.ItemAdapterCallback {

    private var _binding: FragmentHomeNewTasteBinding? = null
    private val binding get() = _binding!!

    private var foodList : ArrayList<HomeVerticalModel> = ArrayList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_new_taste, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = HomeNewTasteAdapter(foodList.this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)
        binding.rvListHomeNewTaste.layoutManager = layoutManager
        binding.rvListHomeNewTaste.adapter = adapter
    }

    fun initDataDummy() {
        foodList = ArrayList()
        foodList.add(HomeVerticalModel("Cherry Healthy", "10000", "",5f))
        foodList.add(HomeVerticalModel("Burger Tamayo", "10000", "",4f))
        foodList.add(HomeVerticalModel("Alpokat Kocok", "10000", "",4.8f))
    }

    override fun onClick(v: View, data: HomeVerticalModel) {
        Toast.makeText(context,"Percobaan klik item" + data.title, Toast.LENGTH_LONG).show()
    }

}