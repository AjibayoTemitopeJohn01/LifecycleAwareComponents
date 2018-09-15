package com.annapurna.smartherd.s2_v1_lifecycledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

// LifecycleOwner
public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Observer Removed");
        getLifecycle().removeObserver(new MainActivityObserver());
    }
}
