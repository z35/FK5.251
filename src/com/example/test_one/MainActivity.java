package com.example.test_one;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("info", "onCreate");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        Log.i("info", "onCreateOptionsMenu");
        return true;
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	Log.i("info", "onStart");
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	Log.i("info", "onRestart");
    }

    @Override
    protected void onResume() {
    	super.onResume();
    	Log.i("info", "onResume");
    }

    @Override
    protected void onPause() {
    	super.onPause();
    	Log.i("info", "onPause");
    }

    @Override
    protected void onStop() {
    	super.onStop();
    	Log.i("info", "onStop");
    }

    @Override
    protected void onDestroy()  {
    	super.onDestroy();
    	Log.i("info", "onDestroy");
    }
    
}	
