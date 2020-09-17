package com.org.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.entity.Course;

public class CourseDaoTest {
	
	CourseDao courseDao;
	
	@Before
	public void setUp() {
		ApplicationContext api = new ClassPathXmlApplicationContext("applicationContext.xml");
		courseDao =(CourseDao) api.getBean("courseDao");
		//可以使用方法containsBean查看容器中是否存在小括号中的对象
		System.out.println(api.containsBean("courseDao"));
	}
	
	@Test
	public void testinsertCourse() {
		Course course = new Course(7,"Java Script");
		courseDao.insertCourse(course );
	}
}
