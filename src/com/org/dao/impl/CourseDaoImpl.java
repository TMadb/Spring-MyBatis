package com.org.dao.impl;

import com.org.dao.CourseDao;
import com.org.entity.Course;

public class CourseDaoImpl implements CourseDao {
	
	CourseDao courseDao;
	
	
	//设值注入使用，在主配置文件中配置
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	@Override
	public void insertCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.insertCourse(course);
	}
}
