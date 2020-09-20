package com.org.aspect;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	
	@Test
	public void Test() {
		String parent = "applicationContext.xml";
		ApplicationContext api = new ClassPathXmlApplicationContext(parent); 
	    User man = (User) api.getBean("man");
//	    man.sleep();
	    man.eat();
	    System.out.println(man.speak());
	}
}
