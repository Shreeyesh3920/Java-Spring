package com.springrest.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springRest.entity.course;
import com.springrest.springRest.services.courseService;

@RestController
public class mainController { 
	
//	@GetMapping("/home")
//	public String home() 
//	{
//		return "Welcome to Courses REST API";
//	}

@Autowired
private	courseService courseservice;


	//GETTING ALL COURSES
	@GetMapping("/courses")
	public List<course> getcourse()
	{
		return this.courseservice.getcourses();
	}
	
	//GETTING COURSE WITH ID
	@GetMapping("/courses/{courseId}")
	public course getcourseWithId(@PathVariable String courseId) 
	{
		return this.courseservice.getcourse(Long.parseLong(courseId));	
	}
	
	
	//ADDING COURSE
	@PostMapping(path="/courses")
	public course addCourse(@RequestBody course course) 
	{
		return this.courseservice.addCourse(course);
		
	}
	
	//DELETING COURSE WITH ID
	@DeleteMapping("/courses/{courseId}")
	public course deleteCourse(@PathVariable String courseId) 
	{
		return this.courseservice.deleteCourse(Long.parseLong(courseId));
		
	}
	
	//UPDATING OR PUTTING WITH ID
	@PutMapping("/courses/{courseId}")
	public course updateCourse(@PathVariable String courseId,@RequestBody course Ucourse) 
	{
		return this.courseservice.updateCourse(Long.parseLong(courseId),Ucourse);
		
	}
	
	
}
