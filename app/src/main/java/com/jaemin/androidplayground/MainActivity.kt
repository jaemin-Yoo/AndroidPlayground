package com.jaemin.androidplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.jaemin.androidplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // BottomNavigation 설정
        binding.bottomNav.setupWithNavController(navController)

        // AppBar 설정
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.first_fragment,
            R.id.second_fragment,
            R.id.third_fragment
        ))
        setupActionBarWithNavController(navController, appBarConfiguration)
    }
}