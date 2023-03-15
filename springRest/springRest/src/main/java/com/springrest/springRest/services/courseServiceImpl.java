package com.springrest.springRest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springRest.entity.course;
@Service
public class courseServiceImpl implements courseService{

	List<course> list;
	public courseServiceImpl() 
	{
		list=new ArrayList<>();
		list.add(new course(12,"Java","JAVA is AMAZING"));
		list.add(new course(21,"Hibernate","Hibernate is AMAZING"));
	}
	
	
	@Override
	public List<course> getcourses() {
		return list;
	}


	@Override
	public course getcourse(long courseId) {
		course c=null;
		for(course Course:list) 
		{
			if(Course.getId()==courseId) 
			{
				c=Course;
				break;
			}
		}
		return c;
	}


	@Override
	public course addCourse(course course) {
		list.add(course);
		return course;
	}


	@Override
	public course deleteCourse(long courseId) {
		course c=null;
		for(course Course:list) 
		{
			if(Course.getId()==courseId) 
			{
				c=Course;
				list.remove(Course);
				break;
			}
		}
		return c;
	}


	@Override
	public course updateCourse(long courseId, course Ucourse) {
		course c=null;
		for(course Course:list) 
		{
			if(Course.getId()==courseId) 
			{
				c=Course;
				list.set((int) courseId, Ucourse);
				break;
			}
		}
		return c;
	}

}
