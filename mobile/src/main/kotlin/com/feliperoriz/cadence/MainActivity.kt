package com.feliperoriz.cadence

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.feliperoriz.cadence.extensions.newInstance
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Felipe Roriz on 5/5/16.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val library = AHBottomNavigationItem("Library", getDrawable(R.drawable.icon_library), getColor(R.color.colorPrimary));
        val search = AHBottomNavigationItem("Search", getDrawable(R.drawable.icon_search), getColor(R.color.colorPrimary));
        val settings = AHBottomNavigationItem("Settings", getDrawable(R.drawable.icon_settings), getColor(R.color.colorPrimary));

        nav_drawer.defaultBackgroundColor = getColor(R.color.spotify_black_solid)
        nav_drawer.addItem(library)
        nav_drawer.addItem(search)
        nav_drawer.addItem(settings)

        nav_drawer.setOnTabSelectedListener { position, wasSelected -> getSelectedTab(position)}

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, LibraryFragment().newInstance())
                .commit()
    }

    private fun getSelectedTab(position: Int) {
        when (position) {
            0 -> switchToTab(LibraryFragment().newInstance())
            1 -> switchToTab(SearchFragment().newInstance())
            2 -> switchToTab(SettingsFragment().newInstance())
        }
    }

    private fun switchToTab(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit()
    }


}