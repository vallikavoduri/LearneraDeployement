package com.klef.jfsd.sdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.service.AdminService;
import com.klef.jfsd.sdp.service.InstructorService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class InstructorController
{
	@Autowired
	private InstructorService instructorService;
	
	@Autowired
	private AdminService adminService;

	 @GetMapping("instructorhome")
	  public ModelAndView instructorhome()
	  {
	    ModelAndView mv=new ModelAndView("instructor-dashboard");
	    return mv;
	  }
	 
	 @GetMapping("instructorreg")
	   public ModelAndView instructorreg()
	   {
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("instructor-register");
		   return mv;
	   }
	  
	  @PostMapping("insertinstructor")
	   public ModelAndView insertinstructor(HttpServletRequest request)
	   {
	    String name = request.getParameter("iname");
	    String gender = request.getParameter("igender");
	    String email = request.getParameter("iemail");
	    String password = request.getParameter("ipwd");
	    String contact = request.getParameter("icontact");
	    String qualification = request.getParameter("iqualification");
	    String status = "Registered";
	    
	      Instructor instructor = new Instructor();
	      instructor.setName(name);
	      instructor.setGender(gender);
	      instructor.setEmail(email);
	      instructor.setPassword(password);
	      instructor.setContact(contact);
	      instructor.setQualification(qualification);
	      instructor.setStatus(status);
	      
	      String msg = instructorService.instructorRegistraion(instructor);

	      ModelAndView mv = new ModelAndView("instructor-login");
	      return mv;

	   }
	  
	  @GetMapping("instructorlogin")
	  public ModelAndView instructorlogin() {
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("instructor-login");
	    return mv;
	  }
	  
	  @PostMapping("checkInstructorLogin")
	  //@ResponseBody
	  public ModelAndView checkInstructorLogin(HttpServletRequest request) 
	  {
		   ModelAndView mv = new ModelAndView();
		   String iemail=request.getParameter("iemail"); 
		   String ipassword= request.getParameter("ipwd"); 
		   Instructor instructor = instructorService.checkInstructorLogin(iemail, ipassword); 
		   System.out.println(instructor.getStatus());
	    if(instructor.getStatus().equals("Approved")) {
	   
	    	 HttpSession session = request.getSession();
		   	 session.setAttribute("instructor",instructor);
		   	 mv.setViewName("instructor-dashboard");
	    }
	    else 
	    {
	     mv.setViewName("statuspending");
	    }
	    return mv;
	  }  
	  
	  @GetMapping("instructorlogout")
	  public ModelAndView cclogout(HttpServletRequest request)
	  {
		   HttpSession session = request.getSession();
		   
		   session.removeAttribute("instructor"); 
		     
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("index");
		   return mv;
	  }
	  @GetMapping("instructorsessionexpiry")
	  public ModelAndView instructorsessionexpiry()
	  {
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("sessionexpiry");
		   return mv;
	  }

	  @GetMapping("statuspending")
	  public ModelAndView statuspending()
	  {
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("statuspending");
	    return mv;
	  }
	  
	  //***********STUDENT***************
	  
	  @GetMapping("viewallstu") 
	  public ModelAndView viewallstu()
	  { 
	    ModelAndView mv = new ModelAndView(); 
	    List<Student> studentlist = instructorService.ViewAllStu(); 
	    mv.setViewName("instructor-viewallstudents"); 
	    mv.addObject("studentlist",studentlist); 
	    return mv; 
	  } 
	  
	  @GetMapping("viewallcour")
	  public ModelAndView viewallcour()
	  {
		   List<Course> courselist = instructorService.ViewAllCours();
		   
		   ModelAndView mv = new ModelAndView("instructor-viewallcourses");
		   
		   mv.addObject("courselist", courselist);
		   
		   return mv;
	  }
	  
	  @GetMapping("displaycoimage")
	  public ResponseEntity<byte[]> displaycoimage(@RequestParam int id) throws Exception
	  {
	    Course course =  instructorService.ViewCouByID(id);
	    byte [] imageBytes = null;
	    imageBytes = course.getImage().getBytes(1,(int) course.getImage().length());

	    return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
	    
	  // Response Body, HTTP Status Code, Headers
	  }
	  
}
