package com.example.helper.activity.lifecycle;

import com.example.test_one.R;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class ActivityLifecycle implements IActivityLifecycle {

	@Override
	public void onCreate(final Activity activity) {
		activity.setContentView(R.layout.activity_main);
        Log.i("info", "onCreate()");
	}

	@Override
	public boolean onCreateOptionsMenu(final Activity activity, final Menu menu) {
		assert menu != null : "Your 'menu' is NULL";
        activity.getMenuInflater().inflate(R.menu.main, menu);
        Log.i("info", "onCreateOptionsMenu()");
        return true;
	}
	
	@Override
	public void onStart(final Activity activity) {
    	Log.i("info", "onStart()");
	}

	@Override
	public void onRestart(final Activity activity) {
    	Log.i("info", "onRestart()");

	}

	@Override
	public void onResume(final Activity activity) {
    	Log.i("info", "onResume()");

	}

	@Override
	public void onPause(final Activity activity) {
    	Log.i("info", "onPause()");

	}

	@Override
	public void onStop(final Activity activity) {
    	Log.i("info", "onStop()");

	}

	@Override
	public void onDestroy(final Activity activity) {
    	Log.i("info", "onDestroy()");

	}

}
