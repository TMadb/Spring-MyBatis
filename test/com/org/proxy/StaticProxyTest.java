package com.org.proxy;

import org.junit.Test;

public class StaticProxyTest {
	
	@Test
	public void testStaticProxy() {
		LazyService lazyService = new LazyService();
		StaticProxy staticProxy = new StaticProxy(lazyService);
		staticProxy.save();
	}

}
