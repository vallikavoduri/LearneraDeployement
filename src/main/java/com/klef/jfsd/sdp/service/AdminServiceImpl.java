package com.klef.jfsd.sdp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.repository.AdminRepository;
import com.klef.jfsd.sdp.repository.CourseRepository;
import com.klef.jfsd.sdp.repository.CreatorRepository;
import com.klef.jfsd.sdp.repository.InstructorRepository;
import com.klef.jfsd.sdp.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService
{

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private CreatorRepository creatorRepository;
	
	@Autowired
	private InstructorRepository instructorRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Admin checkAdminLogin(String username, String password) {
		   return adminRepository.checkAdminLogin(username, password);
		}

	@Override
	public List<Instructor> ViewAllInstructors() 
	{
		return instructorRepository.findAll();
	}

	@Override
	public String updateinststatus(String status, int iid) {
		instructorRepository.updateinststatus(status, iid);
		return "Instructor Status Updated Successfully";
	}

	@Override
	public String deleteinstructor(int iid) 
	{
		instructorRepository.deleteById(iid);
		return "Instructor Deleted Successfully";
	}
	
	public Instructor getInstructorById(int id) 
	{
        return instructorRepository.findById(id).orElse(null);
    }

    public void updateInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
    }
	

	@Override
	public List<Student> ViewAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public String updatestudentstatus(String status, int sid) {
		studentRepository.updatestudentstatus(status, sid);
		return "Student Status Updated Successfully";
	}

	@Override
	public String deletestudent(int sid) {
		studentRepository.deleteById(sid);
		return "Student Deleted Successfully";
	}

	@Override
	public List<ContentCreator> ViewAllCC() 
	{
		return creatorRepository.findAll();
	}

	@Override
	public String updateccstatus(String status, int cid) 
	{
		creatorRepository.updateccstatus(status, cid);
		return "CC Status Updated Successfully";
	}

	@Override
	public String deletecc(int cid) 
	{
		creatorRepository.deleteById(cid);
		return "CC Deleted Successfully";
	}

	@Override
	public List<Course> ViewAllCourses() 
	{
		return courseRepository.findAll();
	}

	@Override
	public Course ViewCourseByID(int courseid) {
		return courseRepository.findById(courseid).get();
	}
	
}
