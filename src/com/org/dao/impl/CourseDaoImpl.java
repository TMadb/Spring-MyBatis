package com.org.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.org.dao.CourseDao;
import com.org.entity.Course;

@Service
public class CourseDaoImpl implements CourseDao {
	
	@Resource
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
