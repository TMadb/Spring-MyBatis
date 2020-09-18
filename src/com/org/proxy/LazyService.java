package com.org.proxy;

public class LazyService implements UserService{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("save method");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("find method");
	}

}
