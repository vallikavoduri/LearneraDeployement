package com.klef.jfsd.sdp.service; 
 
import java.util.List;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;
 
public interface AdminService
{ 
	
 public Admin checkAdminLogin(String username, String password);
 
 public List<Instructor> ViewAllInstructors(); 
 public String updateinststatus(String status,int iid);
 public String deleteinstructor(int iid);
 public Instructor getInstructorById(int id);
 public void updateInstructor(Instructor instructor);
 
 public List<Student> ViewAllStudents(); 
 public String updatestudentstatus(String status,int sid);
 public String deletestudent(int sid);
 
 public List<ContentCreator> ViewAllCC(); 
 public String updateccstatus(String status,int cid);
 public String deletecc(int cid);
 
 public List<Course> ViewAllCourses();
 public Course ViewCourseByID(int courseid);


}