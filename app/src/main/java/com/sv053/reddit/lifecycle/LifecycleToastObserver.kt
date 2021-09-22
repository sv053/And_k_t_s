package com.sv053.reddit.lifecycle

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LifecycleToastObserver (
    private val context: Context
    ) : LifecycleObserver {

        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        fun create() {
            Toast.makeText(context, "onCreate", Toast.LENGTH_SHORT).show()
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        fun destroy() {
            Toast.makeText(context, "onDestroy", Toast.LENGTH_SHORT).show()
        }

}