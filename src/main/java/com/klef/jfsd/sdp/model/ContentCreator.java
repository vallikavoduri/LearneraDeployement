package com.klef.jfsd.sdp.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cc_table")
public class ContentCreator
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private int id;
	@Column(name = "cname",length = 50,nullable = false)
	private String name;
	@Column(name = "cgender",length = 20,nullable = false)
	private String gender;
	@Column(name = "cemail",length = 20,nullable = false,unique = true)
	private String email;
	@Column(name = "cpwd",length = 20,nullable = false)
	private String password;
	@Column(name = "ccontact",length = 50,nullable = false,unique = true)
	private String contact;
	@Column(name = "cqualification",length = 50,nullable = false)
	private String qualification;
	@Column(name="cstatus",nullable=false,length=50)
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
