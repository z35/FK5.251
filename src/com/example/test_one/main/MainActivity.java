package com.example.test_one.main;

import com.example.helper.activity.ActivityGuard;
import com.example.helper.activity.ActivityGuardFactory;
import com.example.helper.activity.events.MainActivityEvents;
import com.example.helper.activity.lifecycle.ActivityLifecycle;
import com.example.helper.activity.lifecycle.IActivityLifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	////////////////////////////////////////////////////////////////////////////
	// fields
	////////////////////////////////////////////////////////////////////////////
	
	private IActivityLifecycle lifeCycle;
	private MainActivityEvents events;
	
	////////////////////////////////////////////////////////////////////////////
	// standard class life cycle
	////////////////////////////////////////////////////////////////////////////
	
	public MainActivity() {

		ActivityGuard<MainActivityEvents> ev = ActivityGuardFactory.newInstance(
				new ActivityLifecycle(), 
        		new MainActivityEvents());

        events = ev.getEvents(); 
        Log.i("info", events.toString());
        
        lifeCycle = ev.getLifeCycle();
        
	}
	
	////////////////////////////////////////////////////////////////////////////
	// Activity life cycle events
	////////////////////////////////////////////////////////////////////////////
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        lifeCycle.onCreate(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return lifeCycle.onCreateOptionsMenu(this, menu);
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	lifeCycle.onStart(this);
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	lifeCycle.onRestart(this);
    }

    @Override
    protected void onResume() {
    	super.onResume();
    	lifeCycle.onResume(this);
    }

    @Override
    protected void onPause() {
    	super.onPause();
    	lifeCycle.onPause(this);
    }

    @Override
    protected void onStop() {
    	super.onStop();
    	lifeCycle.onStop(this);
    }

    @Override
    protected void onDestroy()  {
    	super.onDestroy();
    	lifeCycle.onDestroy(this);
    }

	////////////////////////////////////////////////////////////////////////////
	// control events
	////////////////////////////////////////////////////////////////////////////
    
    
}	
