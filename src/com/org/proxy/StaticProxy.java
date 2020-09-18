package com.org.proxy;

public class StaticProxy implements UserService {
	
	LazyService lazyService;
	
	public StaticProxy(LazyService lazyservice) {
		this.lazyService = lazyservice;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("save method start");
		lazyService.save();
		System.out.println("save method over");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("find method");
	}

}
