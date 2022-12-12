package com.tandiera.project.foodmarket.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tandiera.project.foodmarket.R
import com.tandiera.project.foodmarket.databinding.FragmentSignInBinding
import com.tandiera.project.foodmarket.databinding.FragmentSignUpAddressBinding

class SignUpAddressFragment : Fragment() {

    private var _binding: FragmentSignUpAddressBinding? = null
    private val binding get() =_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSignUpAddressBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.btnSignUpNowSignUpAddress.setOnClickListener{
            Navigation.findNavController(it)
                .navigate(R.id.action_signup_success, null)
        }
    }

}