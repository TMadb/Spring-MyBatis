package com.org.aspect;

import org.apache.ibatis.annotations.One;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 * 切面类
 * 作用是将可复用的交叉业务织入到想要织入的方法中
 */
//
@Aspect
public class MyOneAspect {
	
	/*
	 * 前置通知
	 * 所有通知都通用的参数JoinPoint(切入点，显示当前的通知在接口的何处织入)
	 */
//	@Before("execution(* com.org.aspect.*.*(..))")
//	public void before(JoinPoint point) {
//		System.out.println("前置织入的增强方法"+point);
//	}
	
	/*
	 * 后置通知
	 * 所有通知都通用的参数JoinPoint(切入点，显示当前的通知在接口的何处织入)
	 * 可以获取到目标方法的返回值，但是不能真正修改(可以修改来展示一下)
	 * returning的值一定要和方法后面的参数名一样
	 */
//	@AfterReturning("execution(* com.org.aspect.*.*(..))")
//	public void after(JoinPoint point) {
//		System.out.println("织入的增强方法"+point);
//	}
//	@AfterReturning(value = "execution(* *..User.s*(..))",returning="obj")
//	public void after(Object obj) {
//		//不能真正修改
//		System.out.println("获取返回值修改展示:");
//		if(obj != null && obj.getClass().getTypeName().equals("java.lang.String")) {
//			String str = obj.toString().toUpperCase();
//			System.out.println("转换加工后的返回值(没有真正的修改返回值):"+str);
//		}else {
//			System.out.println("出错了...");
//		}
//	}
	
	/*
	 * 环绕通知(功能最强，可以取代其他的通知)
	 * 可以真的修改目标的返回值
	 * 使用ProceedingJoinPoint调用目标方法
	 */
	@Around("execution(* com.org.aspect.*.*(..))")
	public Object after(ProceedingJoinPoint point) throws Throwable {
		System.out.println("环绕方式开始织入:null");
		//此异常不处理直接向上抛，因为方法在定义时考虑到了异常的问题，所以不用我们处理
		Object obj = point.proceed();
		String str = obj.toString().toUpperCase();
		System.out.println("环绕方式执行后:");
	    return str;	
	}
	
	/*
	 * 异常通知
	 * 及其各种异常
	 */
//	@AfterThrowing("execution(* com.org.aspect.*.*(..))")
//	public void afterthrow() {
//		System.out.println("程序发生异常...");
//	}
	
//	@AfterThrowing(value = "execution(* com.org.aspect.*.*(..))",throwing ="rx")
//	public void afterthrow(RuntimeException rx) {
//		System.out.println("程序运行时发生异常...");
//	}
	
//	@AfterThrowing(value = "execution(* com.org.aspect.*.*(..))",throwing ="nx")
//	public void afterthrow(NullPointerException nx) {
//		System.out.println("空指针异常...");
//	}
	/*
	 * 最终通知(类似于finally，不管程序有没有异常都会执行)
	 */
	@After("execution(* com.org.aspect.*.*(..))")
	public void after() {
		System.out.println("最后的晚餐");
	}
}
