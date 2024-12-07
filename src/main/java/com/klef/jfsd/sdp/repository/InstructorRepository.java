package com.klef.jfsd.sdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.Instructor;

import jakarta.transaction.Transactional;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor,Integer >
{

	@Query("select i from Instructor i where i.email=?1 and i.password=?2") 
	 public Instructor checkInstructorLogin(String email, String password) ;
	
	@Query("update Instructor i set i.status=?1 where i.id=?2 ")
	@Modifying
	@Transactional
 	public int updateinststatus(String status,int iid);
}
