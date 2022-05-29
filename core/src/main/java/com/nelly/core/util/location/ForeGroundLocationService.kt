package com.nelly.core.util.location

import android.content.Intent
import android.os.IBinder
import androidx.lifecycle.LifecycleService

class ForeGroundLocationService : LifecycleService() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(intent: Intent): IBinder? {
        return super.onBind(intent)
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}