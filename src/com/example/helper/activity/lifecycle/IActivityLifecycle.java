package com.example.helper.activity.lifecycle;

import android.app.Activity;
import android.view.Menu;

public interface IActivityLifecycle {

	void onCreate(Activity activity);
	
	boolean onCreateOptionsMenu(Activity activity, Menu menu);
	
	void onStart(Activity activity);
	     
	void onRestart(Activity activity);
	
	void onResume(Activity activity);
	
	void onPause(Activity activity);
	
	void onStop(Activity activity);
	
	void onDestroy(Activity activity);

}
