package com.feliperoriz.cadence

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

/**
 * Created by Felipe Roriz on 5/5/16.
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Testing", Toast.LENGTH_LONG).show()
    }
}