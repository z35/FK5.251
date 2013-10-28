package com.example.helper;

import android.view.Menu;

public interface IActivityLifecycle {

	void onCreate();
	
	boolean onCreateOptionsMenu(Menu menu);
	
	void onStart();
	     
	void onRestart();
	
	void onResume();
	
	void onPause();
	
	void onStop();
	
	void onDestroy();

}
