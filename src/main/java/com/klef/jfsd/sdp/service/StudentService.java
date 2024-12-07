package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Student;

public interface StudentService
{

	public String studentRegistraion(Student s);
	public Student checkStudentLogin(String email,String password);
	
	public List<Course> ViewAllCourse();
	public Course ViewCoursByID(int courseid);
}
