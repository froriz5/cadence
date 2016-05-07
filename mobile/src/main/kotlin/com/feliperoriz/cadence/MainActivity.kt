package com.feliperoriz.cadence

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
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
        val item4 = AHBottomNavigationItem("Item 4", getDrawable(R.drawable.icon_settings), getColor(R.color.colorPrimary));
        val item5 = AHBottomNavigationItem("Item 5", getDrawable(R.drawable.icon_settings), getColor(R.color.colorPrimary));
        nav_drawer.addItem(library)
        nav_drawer.addItem(search)
        nav_drawer.addItem(settings)
        nav_drawer.addItem(item4)
        nav_drawer.addItem(item5)
        nav_drawer.currentItem = 0
    }
}