package com.mycompany.app1.matcher;

import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class MyDoubleBetween implements Matcher<Double>{

	private double inclusiveMini;
	private double exclusiveMaxi;
	
	public MyDoubleBetween() {
		super();
		this.inclusiveMini = 0;
		this.exclusiveMaxi = 100;
	}
	
	
	public MyDoubleBetween(double inclusiveMini, double exclusiveMaxi) {
		super();
		this.inclusiveMini = inclusiveMini;
		this.exclusiveMaxi = exclusiveMaxi;
	}

	@Override
	public boolean matches(Object arg0) {
		Double x= (Double) arg0;
		if(x>inclusiveMini && x < exclusiveMaxi)
			return true;
		/*else*/
		return false;
	}
	
	@Override
	public void describeTo(Description arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void describeMismatch(Object arg0, Description arg1) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
