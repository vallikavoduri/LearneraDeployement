package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.InstructorCourseMapping;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.repository.CourseRepository;
import com.klef.jfsd.sdp.repository.CreatorRepository;
import com.klef.jfsd.sdp.repository.InstructorCourseMappingRepository;
import com.klef.jfsd.sdp.repository.InstructorRepository;
import com.klef.jfsd.sdp.repository.StudentRepository;

@Service
public class CreatorServiceImpl implements CreatorService
{
	@Autowired
	private CreatorRepository creatorrepository;
	
	@Autowired
	private InstructorRepository instructorRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private InstructorCourseMappingRepository instructorCourseMappingRepository;
	
	@Override
	public String CCRegistraion(ContentCreator c)
	{
		creatorrepository.save(c);
		return "Content Creator Registration Successfull" ;
	}

	@Override
	public ContentCreator checkCCLogin(String email, String password) 
	{
		return creatorrepository.checkCCLogin(email, password);
		
	}

	@Override
	public List<Instructor> viewAllInstructors() {
		return instructorRepository.findAll();
	}

	@Override
	public List<Course> viewAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public String addCourseMapping(InstructorCourseMapping courseMapping) {
		instructorCourseMappingRepository.save(courseMapping);
		return "saved";
	}

	@Override
	public String AddCourse(Course course) {
		courseRepository.save(course);
		return "Course Added Successfully";
	}

	@Override
	public List<InstructorCourseMapping> viewAllMappings() 
	{
	    return instructorCourseMappingRepository.findAll(); 
	}
	
	@Override
	public List<Student> ViewAllStud() 
	{
		return studentRepository.findAll();
	}

	@Override
	public Course ViewCourseByID(int courseid) 
	{
		return courseRepository.findById(courseid).get();
	}
}