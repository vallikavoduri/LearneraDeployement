package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.repository.CourseRepository;
import com.klef.jfsd.sdp.repository.InstructorRepository;
import com.klef.jfsd.sdp.repository.StudentRepository;

@Service
public class InstructorServiceImpl implements InstructorService
{
	@Autowired
	private InstructorRepository instructorrepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public String instructorRegistraion(Instructor i)
	{
		instructorrepository.save(i);
		return "Instructor Registration Successfull" ;
	}

	@Override
	public Instructor checkInstructorLogin(String email, String password) 
	{
		return instructorrepository.checkInstructorLogin(email, password);
		
	}

	@Override
	public List<Student> ViewAllStu() 
	{
		return studentRepository.findAll();
	}

	@Override
	public List<Course> ViewAllCours() 
	{
		return courseRepository.findAll();
	}

	@Override
	public Course ViewCouByID(int courseid) 
	{
		return courseRepository.findById(courseid).get();
	}

}
