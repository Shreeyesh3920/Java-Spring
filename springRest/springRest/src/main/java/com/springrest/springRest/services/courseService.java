package com.springrest.springRest.services;

import java.util.List;

import com.springrest.springRest.entity.course;

public interface courseService {

	
	public List<course> getcourses();
	public course getcourse(long courseId);
	public course addCourse(course course);
	public course deleteCourse(long courseId);
	public course updateCourse(long courseId, course Ucourse);
}
