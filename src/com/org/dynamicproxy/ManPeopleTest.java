package com.org.dynamicproxy;

/*
 * JDK动态代理
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.junit.Test;

public class ManPeopleTest {
	
	
	@Test
	public void TestDynamicProxy() {
		//子类对象指向父类引用，多态
		User man = new ManPeople();
		
		ClassLoader loader = null;
		/* 
		 * loader 类加载器  man.getClass().getClassLoader()
		 * interfaces 要增强的对象的所有接口类型  man.getClass().getInterfaces()
		 * ｈ　执行扩展的增强方法，实现接口，实现增强
		 * 匿名内部类  不可复用，但是简单省事，其原理就是接口的实现类对象
		 */
		User myProxyInstance =(User) Proxy.newProxyInstance(
				man.getClass().getClassLoader(),
				man.getClass().getInterfaces(), 
				new InvocationHandler() {
					/*
					 * proxy  代理对象，目标对象增强以后的对象
					 * method  执行增强的方法
					 * args  目标方法的参数
					 */
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//前置增强
//						System.out.println("增强前增加添加新的功能");
//						真正实现功能增强的方法
//						Object invoke = method.invoke(man, args);
//						System.out.println("增强后增加添加新的功能");
						//针对性的增强指定的方法
						if(method.getName().startsWith("e")) {
							//前置增强
							System.out.println("增强前增加添加新的功能");
							Object invoke = method.invoke(man, args);
							//后置增强
							System.out.println("增强后增加添加新的功能");
							return invoke;
						}else {
							Object invoke = method.invoke(man, args);
							return invoke;
						}
					}
				});
		System.out.println(myProxyInstance.getClass());
		myProxyInstance.eat();
//		System.out.println(myProxyInstance instanceof User);
//		System.out.println("------------------");
//		myProxyInstance.sleep();
	}

}
