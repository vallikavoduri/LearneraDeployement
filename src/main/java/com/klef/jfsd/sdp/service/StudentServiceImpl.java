package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.repository.CourseRepository;
import com.klef.jfsd.sdp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository studentrepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public String studentRegistraion(Student s) 
	{
		studentrepository.save(s);
		return "Student Registered Succesfully" ;

	}

	@Override
	public Student checkStudentLogin(String email, String password) 
	{
		return  studentrepository.checkStudentLogin(email, password);

	}

	@Override
	public List<Course> ViewAllCourse() 
	{
		return courseRepository.findAll();
	}

	@Override
	public Course ViewCoursByID(int courseid) 
	{
		return courseRepository.findById(courseid).get();
	}

}
