package com.tandiera.project.foodmarket.ui.profile.foodmarket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tandiera.project.foodmarket.databinding.FragmentProfileFoodMarketBinding

class AccountFragment : Fragment() {

    private var _binding: FragmentProfileFoodMarketBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileFoodMarketBinding.inflate(inflater, container, false)
        return binding.root
    }
}