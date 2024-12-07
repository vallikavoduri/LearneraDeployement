package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.InstructorCourseMapping;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.model.Instructor;

public interface CreatorService 
{
	public String CCRegistraion(ContentCreator c);
	public ContentCreator checkCCLogin(String email,String password);
	
    public String AddCourse(Course course);
	
	public List<Instructor> viewAllInstructors();
	public List<Course> viewAllCourses();
	
	public String addCourseMapping(InstructorCourseMapping courseMapping);
	public List<InstructorCourseMapping> viewAllMappings();
	
	public List<Student> ViewAllStud();
	
    public Course ViewCourseByID(int courseid);
	
}
