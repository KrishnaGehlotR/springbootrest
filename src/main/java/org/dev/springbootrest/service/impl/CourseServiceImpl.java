package org.dev.springbootrest.service.impl;

import java.util.List;

import org.dev.springbootrest.entities.Course;
import org.dev.springbootrest.repositories.CourseDAO;
import org.dev.springbootrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDAO courseDAO;

	@Override
	public List<Course> getCourses() {
		return courseDAO.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		return courseDAO.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		return courseDAO.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		return courseDAO.save(course);
	}

	@Override
	public void deleteCourse(long courseId) {
		courseDAO.deleteById(courseId);
	}

}
