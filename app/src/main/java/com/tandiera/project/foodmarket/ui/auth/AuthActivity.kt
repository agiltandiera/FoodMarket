package com.tandiera.project.foodmarket.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.appcompat.widget.Toolbar
import com.tandiera.project.foodmarket.R
import com.tandiera.project.foodmarket.databinding.ActivityAuthBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val pageRequest = intent.getIntExtra("page_request", 0)
        if(pageRequest == 2) {
            toolbarSignUp()
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignIn, true)
                .build()

            Navigation.findNavController(findViewById(R.id.authHostFragment))
                .navigate(R.id.action_signup, null, navOptions)
        }
    }

    // bagaimana caranya panggil toolbar di layout toolbar yang include di ui activity auth?
    fun toolbarSignUp() {
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.layoutToolbar.toolbar)

        binding.layoutToolbar.toolbar.title = "Sign Up"
        binding.layoutToolbar.toolbar.subtitle = "Register and eat"
        binding.layoutToolbar.toolbar.navigationIcon = resources.getDrawable(R.drawable.arrow_back_ios_24px_outlined, null)
        binding.layoutToolbar.toolbar.setNavigationOnClickListener { onBackPressed()}
    }

    fun toolbarSignUpAddress() {
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.layoutToolbar.toolbar)

        binding.layoutToolbar.toolbar.title = "Address"
        binding.layoutToolbar.toolbar.subtitle = "Make sure it is valid"
        binding.layoutToolbar.toolbar.navigationIcon = resources.getDrawable(R.drawable.arrow_back_ios_24px_outlined, null)
        binding.layoutToolbar.toolbar.setNavigationOnClickListener { onBackPressed()}
    }

    fun toolbarSignUpSuccess() {
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.layoutToolbar.toolbar)

        binding.layoutToolbar.toolbar.visibility = View.GONE
    }
}