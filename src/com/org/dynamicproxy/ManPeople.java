package com.org.dynamicproxy;

public class ManPeople implements User {

	@Override
	public void eat() {
		
		System.out.println("eat():"+"do do up");
	}

	@Override
	public void sleep() {
	 
		System.out.println("sleep():"+"more more");
		
	}

}
