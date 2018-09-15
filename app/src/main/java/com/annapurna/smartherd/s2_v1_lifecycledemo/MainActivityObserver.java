package com.annapurna.smartherd.s2_v1_lifecycledemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

// LifecycleObserver
public class MainActivityObserver implements LifecycleObserver {

    private String TAG = this.getClass().getSimpleName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent() {
        Log.i(TAG, "ON_CREATE Event");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent() {
        Log.i(TAG, "ON_START event");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent() {
        Log.i(TAG, "ON_RESUME event");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent() {
        Log.i(TAG, "ON_PAUSE event");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent() {
        Log.i(TAG, "ON_STOP event");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent() {
        Log.i(TAG, "ON_DESTROY event");
    }
}
