package com.example.test_one;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	private ActivityLifecycle af;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        af = new ActivityLifecycle(this);
        af.onCreate();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return af.onCreateOptionsMenu(menu);
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	af.onStart();
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	af.onRestart();
    }

    @Override
    protected void onResume() {
    	super.onResume();
    	af.onResume();
    }

    @Override
    protected void onPause() {
    	super.onPause();
    	af.onPause();
    }

    @Override
    protected void onStop() {
    	super.onStop();
    	af.onStop();
    }

    @Override
    protected void onDestroy()  {
    	super.onDestroy();
    	af.onDestroy();
    }
    
}	
