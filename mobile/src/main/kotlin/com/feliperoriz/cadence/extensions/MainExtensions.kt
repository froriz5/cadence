package com.feliperoriz.cadence.extensions

import com.feliperoriz.cadence.LibraryFragment
import com.feliperoriz.cadence.SearchFragment
import com.feliperoriz.cadence.SettingsFragment

/**
 * Created by Felipe Roriz on 5/7/16.
 */
fun LibraryFragment.newInstance(): LibraryFragment {
        return LibraryFragment()
}

fun SearchFragment.newInstance(): SearchFragment {
        return SearchFragment()
}

fun SettingsFragment.newInstance(): SettingsFragment {
        return SettingsFragment()
}
