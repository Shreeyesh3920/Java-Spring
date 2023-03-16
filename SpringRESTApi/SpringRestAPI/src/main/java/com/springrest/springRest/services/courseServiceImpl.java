package com.springrest.springRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springRest.CourseDAO.courseDAO;
import com.springrest.springRest.entity.course;
@Service
public class courseServiceImpl implements courseService{
	@Autowired
	private courseDAO coursedao;
	
	@Override
	public List<course> getcourses() {
		
		return coursedao.findAll();
	}

	@Override
	public course getcourse(long courseId) {
		
		return coursedao.getOne(courseId);
	}

	@Override
	public course addCourse(course course) {
		coursedao.save(course);
		return course;
	}

	@Override
	public course deleteCourse(long courseId) {
		   coursedao.deleteById(courseId);
		return null;
	}

	@Override
	public course updateCourse(long courseId, course Ucourse) {
		coursedao.save(Ucourse);
		return null;
	}

}