package com.p1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.p1.Entity.Course;
import com.p1.Service.CourseService;
import com.p1.Service.Serviceimpl;

@RestController
public class controller {

	@Autowired
	private Serviceimpl service;
	
	@GetMapping("/Courses/all")
	public List<Course> getCourses(){
		 List<Course> co = service.getCourses();
		return co;
	}
	@PostMapping("/Courses")
	public Course addCourses(@RequestBody Course cr){
		return service.addCourse(cr);
	}
	
	@GetMapping("/Courses/byid/{id}")
	public Optional<Course> getCourse(@PathVariable long id)
	{
		return service.getCourse(id);
	}
	
	@DeleteMapping("/Courses/{id}")
	public void deleteCourse(@PathVariable long id)
	{
		service.deleteCourse(id);
	}
	@PutMapping("/Courses/update/{id}")
	public void updateCourses(@RequestBody Course co)
	{
		service.updateCourses(co);
	}
	
}
