package com.klef.jfsd.sdp.model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_table")
public class Course
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int courseid;

  @Column(name = "ctitle", length = 50, unique = true, nullable = false)
  private String coursetitle;

  @Column(name = "cdescription", length = 500, unique = true, nullable = false)
  private String coursedescription;

  @Column(name = "cimage", nullable = false)
  private Blob image;

  @Column(name = "cduration", length = 20, nullable = false)
  private String courseduration;
  
//  @Column(name = "cregistered")
//  private int registered; 

  // Getters and setters (if needed)
  
  public int getCourseid() {
    return courseid;
  }

  public void setCourseid(int courseid) {
    this.courseid = courseid;
  }

  public String getCoursetitle() {
    return coursetitle;
  }

  public void setCoursetitle(String coursetitle) {
    this.coursetitle = coursetitle;
  }

  public String getCoursedescription() {
    return coursedescription;
  }

  public void setCoursedescription(String coursedescription) {
    this.coursedescription = coursedescription;
  }

  public Blob getImage() {
    return image;
  }

  public void setImage(Blob image) {
    this.image = image;
  }

  public String getCourseduration() {
    return courseduration;
  }

  public void setCourseduration(String courseduration) {
    this.courseduration = courseduration;
  }
}
