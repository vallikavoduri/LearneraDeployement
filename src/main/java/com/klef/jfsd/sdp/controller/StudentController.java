package com.klef.jfsd.sdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController 
{
	
	@Autowired
	private StudentService studentService;
	
	
	 @GetMapping("studenthome")
	  public ModelAndView studenthome()
	  {
	    ModelAndView mv=new ModelAndView("student-dashboard");
	    return mv;
	  }
	 
	 @GetMapping("studentreg")
	   public ModelAndView studentreg()
	   {
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("student-register");
		   return mv;
	   }
	  
	  @PostMapping("insertstudent")
	   public ModelAndView insertstudent(HttpServletRequest request)
	   {
	    String name = request.getParameter("sname");
	    String gender = request.getParameter("sgender");
	    String dob = request.getParameter("sdob");
	    String email = request.getParameter("semail");
	    String password = request.getParameter("spwd");
	    String contact = request.getParameter("scontact");
	    String status = "Registered";
	    
	      Student student = new Student();
	      student.setName(name);
	      student.setGender(gender);
	      student.setDateofbirth(dob);
	      student.setEmail(email);
	      student.setPassword(password);
	      student.setContact(contact);
	      student.setStatus(status);
	      
	      String msg = studentService.studentRegistraion(student);

	      ModelAndView mv = new ModelAndView("student-login");
	      mv.addObject("message", msg);
	    
	      return mv;

	   }
	  
	  @GetMapping("studentlogin")
	  public ModelAndView studentlogin() {
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("student-login");
	    
	    return mv;
	  }
	  
	  @PostMapping("checkStudentLogin")
	  //@ResponseBody
	  public ModelAndView checkStudentLogin(HttpServletRequest request) 
	  {
		   ModelAndView mv = new ModelAndView();
		   String semail=request.getParameter("semail"); 
		   String spassword= request.getParameter("spwd"); 
		   Student s= studentService.checkStudentLogin(semail, spassword); 

	    if(s!=null) 
	    {
	    	 HttpSession session = request.getSession();
		   	 session.setAttribute("student",s);
	
	      mv.setViewName("student-dashboard");
	    }
	    else {
	     mv.setViewName("studentloginfail");
	      mv.addObject("message","Login Failed!");
	    }
	    return mv;
	  }
	  @GetMapping("studentlogout")
	  public ModelAndView studentlogout(HttpServletRequest request)
	  {
		   HttpSession session = request.getSession();
		   
		   session.removeAttribute("student"); 
		     
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("index");
		   return mv;
	  }
	  @GetMapping("studentsessionexpiry")
	  public ModelAndView ccsessionexpiry()
	  {
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("sessionexpiry");
		   return mv;
	  }
	  
	  @GetMapping("viewallcou")
	  public ModelAndView viewallcou()
	  {
		   List<Course> courselist = studentService.ViewAllCourse();
		   
		   ModelAndView mv = new ModelAndView("student-viewallcourses");
		   
		   mv.addObject("courselist", courselist);
		   
		   return mv;
	  }
	  
	  @GetMapping("displaycouimage")
	  public ResponseEntity<byte[]> displaycouimage(@RequestParam int id) throws Exception
	  {
	    Course course =  studentService.ViewCoursByID(id);
	    byte [] imageBytes = null;
	    imageBytes = course.getImage().getBytes(1,(int) course.getImage().length());

	    return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
	    
	  // Response Body, HTTP Status Code, Headers
	  }
	  
	
}
