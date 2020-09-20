package com.org.aspect.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.dynamicproxy.ManPeople;

public class StaticProxyTest {
	
	@Test
	public void testMyOneAspect() {
		String parent = "applicationContext.xml";
		//使用SpringApi进行解耦
		ApplicationContext api = new ClassPathXmlApplicationContext(parent); 
		ManPeople man =(ManPeople) api.getBean("man");
		man.eat();
		System.out.println(man.getClass());
	}

}
