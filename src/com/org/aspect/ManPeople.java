package com.org.aspect;

public class ManPeople implements User {

	@Override
	public void eat() {
		
		System.out.println("eat():"+"do do up");
	}

	@Override
	public void sleep() {
	    if(true) {
	    	throw new NullPointerException();
	    }
		System.out.println("sleep():"+"more more");
		
	}

	@Override
	public String speak() {
		
		return "nice to meet you";
	}

}
