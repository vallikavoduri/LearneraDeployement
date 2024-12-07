package com.klef.jfsd.sdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.sdp.model.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer>
{

	@Query("select s from Student s where s.email=?1 and s.password=?2") 
	 public Student checkStudentLogin(String email, String password) ;
	
	@Query("update Student s set s.status=?1 where s.id=?2 ")
	@Modifying
	@Transactional
 	public int updatestudentstatus(String status,int sid);
	
}
