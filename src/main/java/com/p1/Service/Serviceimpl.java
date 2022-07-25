package com.p1.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.p1.Entity.Course;

@Service
public class Serviceimpl  {

	@Autowired
	private CourseService courseservice;

	
	
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseservice.findAll();
	}

	public Course addCourse(Course cr) {
		return courseservice.save(cr);
	}

	public void deleteCourse(long p) {
		 courseservice.deleteById(p);
	}

	public Course updateCourses(Course co) {
	courseservice.save(co);
	return co;
	}


	public Optional<Course> getCourse(long id) {
		Optional<Course> co = courseservice.findById(id);
		return co;
	}
	

}
