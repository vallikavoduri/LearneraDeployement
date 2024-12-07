package com.klef.jfsd.sdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.sdp.model.ContentCreator;

import jakarta.transaction.Transactional;

@Repository
public interface CreatorRepository extends JpaRepository<ContentCreator,Integer >
{
	@Query("select c from ContentCreator c where c.email=?1 and c.password=?2") 
	 public ContentCreator checkCCLogin(String email, String password) ;
	
	@Query("update ContentCreator c set c.status=?1 where c.id=?2 ")
	@Modifying
	@Transactional
 	public int updateccstatus(String status,int id);
}
