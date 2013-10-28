package com.example.helper.activity;

import com.example.helper.activity.lifecycle.IActivityLifecycle;

public class ActivityGuardFactory {
	
	/**
	 * 
	 * @param lifeCycle
	 * @param events
	 * @return
	 */
	public static <E> ActivityGuard<E> newInstance(IActivityLifecycle lifeCycle, E events) {
		
		ActivityGuard<E> res = new ActivityGuard<E>(lifeCycle, events);
		
		return res;
	}

}
