package com.p1.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.p1.Entity.Course;

@Repository
public interface CourseService extends JpaRepository<Course,Long> {


		
	
}
