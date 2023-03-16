package com.springrest.springRest.CourseDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springRest.entity.course;

public interface courseDAO extends JpaRepository<course,Long>{
		
}
