package com.example.test_one;

import android.os.Bundle;

public interface IActivityFacade {

	void onCreate(Bundle savedInstanceState);
	
	void onStart();
	     
	void onRestart();
	
	void onResume();
	
	void onPause();
	
	void onStop();
	
	void onDestroy();

}
