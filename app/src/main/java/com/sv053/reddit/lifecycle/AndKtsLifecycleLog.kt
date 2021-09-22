package com.sv053.reddit.lifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class AndKtsLifecycleLog : AppCompatActivity() {

    private val lifecycleObserver = LifecycleToastObserver(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("AppActivity", "onCreate ${hashCode()}")

        lifecycle.addObserver(lifecycleObserver)
    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart ${hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("onResume ${hashCode()}")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("onPause ${hashCode()}")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("onStop ${hashCode()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("onDestroy ${hashCode()}")
        lifecycle.removeObserver(lifecycleObserver)
    }

}