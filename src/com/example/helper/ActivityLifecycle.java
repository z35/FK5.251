package com.example.helper;

import com.example.test_one.R;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class ActivityLifecycle implements IActivityLifecycle {

	private Activity activity;

	/**
	 * 
	 * @param activity
	 */
	public ActivityLifecycle(Activity activity) {
		assert activity != null : "Your 'activity' is NULL";
		this.activity = activity;
	}
	
	@Override
	public void onCreate() {
		activity.setContentView(R.layout.activity_main);
        Log.i("info", "onCreate");
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		assert menu != null : "Your 'menu' is NULL";
        activity.getMenuInflater().inflate(R.menu.main, menu);
        Log.i("info", "onCreateOptionsMenu");
        return true;
	}
	
	@Override
	public void onStart() {
    	Log.i("info", "onStart");
	}

	@Override
	public void onRestart() {
    	Log.i("info", "onRestart");

	}

	@Override
	public void onResume() {
    	Log.i("info", "onResume");

	}

	@Override
	public void onPause() {
    	Log.i("info", "onPause");

	}

	@Override
	public void onStop() {
    	Log.i("info", "onStop");

	}

	@Override
	public void onDestroy() {
    	Log.i("info", "onDestroy");

	}

}
