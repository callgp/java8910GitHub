package com.gp.java9.trywithresources;

public class MyWorker implements AutoCloseable {
	
	MyWorker(){
		System.out.println("creating resource");
	}
	
	public void doSomething() {
		System.out.println("something...");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("closing resource");
		
	}

}
