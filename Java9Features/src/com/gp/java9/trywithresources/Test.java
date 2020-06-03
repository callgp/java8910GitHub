package com.gp.java9.trywithresources;

public class Test {

	public static void main(String[] args) {
		MyWorker mw=new MyWorker();
		try(mw){//it automatically closes earlier all inside try now can put above try stmt up there
			//try(MyWorker mw=new MyWorker()){..before like this innconvenience
			mw.doSomething();
		}catch(Exception e) {
			
		}
	}
}


/*
 * creating resource
 *  something... 
 *  closing resource 
 */
