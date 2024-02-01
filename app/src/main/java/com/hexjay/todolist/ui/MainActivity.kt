package com.hexjay.todolist.ui

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hexjay.todolist.R
import com.hexjay.todolist.databinding.ActivityMainBinding


class MainActivity : BaseActivity() {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //bind Navigation to BottomNavigationView
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        binding.navMain.setupWithNavController(navController)

        //clear icon toast
        clearBottomNavigationToast(binding.navMain)

        //set statusBar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.decorView.windowInsetsController?.setSystemBarsAppearance(
                APPEARANCE_LIGHT_STATUS_BARS,
                APPEARANCE_LIGHT_STATUS_BARS
            )
        }
        //ban darkMode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

    private fun clearBottomNavigationToast(nav: BottomNavigationView) {
        val ids = ArrayList<Int>().apply {
            add(R.id.nav_todolist)
            add(R.id.nav_calendar)
            add(R.id.nav_timing)
            add(R.id.nav_chart)
            add(R.id.nav_discover)
        }
        val bottomNavigationMenuView = nav.getChildAt(0) as ViewGroup
        for (pos in 0 until ids.size) {
            bottomNavigationMenuView.getChildAt(pos).findViewById<View>(ids[pos])
                .setOnLongClickListener { true }
        }
    }
}