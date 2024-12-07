package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;

public interface InstructorService 
{
	public String instructorRegistraion(Instructor i);
	public Instructor checkInstructorLogin(String email,String password);

	 public List<Student> ViewAllStu(); 
	 
	 public List<Course> ViewAllCours();
	 public Course ViewCouByID(int courseid);
}
