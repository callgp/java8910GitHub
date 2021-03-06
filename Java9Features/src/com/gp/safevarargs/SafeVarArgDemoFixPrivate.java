package com.gp.safevarargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarArgDemoFixPrivate {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("abc");
		l.add("xyz");
		
		//ArrayList<String> l2 = Arrays.asList("nyc","lon");//Type mismatch: cannot convert from List<String> to ArrayList<String>..so make List on lhs
		List<String> l2 = Arrays.asList("nyc","lon");
		//l2.add("abc");
		//l2.add("xyz");
		
		/*
		 * Exception in thread "main" java.lang.ClassCastException: class //pollution issue
		 * java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer
		 * and java.lang.String are in module java.base of loader 'bootstrap') at
		 * com.gp.safevarargs.SafeVarArgDemo.myMethod(SafeVarArgDemo.java:26) at
		 * com.gp.safevarargs.SafeVarArgDemo.main(SafeVarArgDemo.java:18)
		 */
		SafeVarArgDemoFixPrivate sv=new SafeVarArgDemoFixPrivate();

		sv.myMethod(l,l2);//now same result ..abc
	}
	
	@SafeVarargs//earier not with pvt methods npw 1.9 private ok
	private void myMethod(List<String>...l) {//List<String>//Type safety: Potential heap pollution via varargs parameter l ..to avoid @SafeVarargs
		
		/*//if comment works ok get..abc

		 * Object[] objects=l; objects[0]=Arrays.asList(1,20);//wrong only String not
		 * int
		 */		
		String name = (String)l[0].get(0);
		System.out.println(name);//problem called dirty heap problem or heap pollution 
		
		
	}
}
