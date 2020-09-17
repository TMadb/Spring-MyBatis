package com.org.dao.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.entity.Course;

public class CourseDaoImplTest {
	
	CourseDaoImpl courseDaoImpl;
	
	@Before
	public void setUp() {
		ApplicationContext api = new ClassPathXmlApplicationContext("applicationContext.xml");
		courseDaoImpl =(CourseDaoImpl) api.getBean("courseDaoImpl");
	}
	
	@Test
	public void testinsertCourse() {
		Course course = new Course(8,"JQuery");
		courseDaoImpl.insertCourse(course);
	}
}
