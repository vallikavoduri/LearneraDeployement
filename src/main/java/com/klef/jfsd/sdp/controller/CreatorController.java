package com.klef.jfsd.sdp.controller;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.InstructorCourseMapping;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.service.AdminService;
import com.klef.jfsd.sdp.service.CreatorService;
import com.klef.jfsd.sdp.service.InstructorService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CreatorController
{
	@Autowired
	private CreatorService creatorService;

	@Autowired
	private AdminService adminService;

	
	 @GetMapping("cchome")
	  public ModelAndView cchome()
	  {
	    ModelAndView mv=new ModelAndView("cc-dashboard");
	    return mv;
	  }
	 
	 @GetMapping("ccreg")
	   public ModelAndView ccreg()
	   {
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("cc-register");
		   return mv;
	   }
	  
	  @PostMapping("insertcc")
	   public ModelAndView insertinstructor(HttpServletRequest request)
	   {
	    String name = request.getParameter("cname");
	    String gender = request.getParameter("cgender");
	    String email = request.getParameter("cemail");
	    String password = request.getParameter("cpwd");
	    String contact = request.getParameter("ccontact");
	    String qualification = request.getParameter("cqualification");
	    String status = "Registered";
	    
	      ContentCreator c = new ContentCreator();
	      c.setName(name);
	      c.setGender(gender);
	      c.setEmail(email);
	      c.setPassword(password);
	      c.setContact(contact);
	      c.setQualification(qualification);
	      c.setStatus(status);
	      
	      String msg = creatorService.CCRegistraion(c);

	      ModelAndView mv = new ModelAndView("cc-login");
	      return mv;

	   }
	  
	  @GetMapping("cclogin")
	  public ModelAndView cclogin() {
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("cc-login");
	    return mv;
	  }
	  
	  @PostMapping("checkCCLogin")
	  //@ResponseBody
	  public ModelAndView checkCCLogin(HttpServletRequest request) 
	  {
		   ModelAndView mv = new ModelAndView();
		   String cemail=request.getParameter("cemail"); 
		   String cpassword= request.getParameter("cpwd"); 
		   ContentCreator c = creatorService.checkCCLogin(cemail, cpassword); 

	    if(c!=null) {
	      
	    	 HttpSession session = request.getSession();
		   	 session.setAttribute("cc",c);

	    	mv.setViewName("cc-dashboard");
	      
	    }
	    else {
	     mv.setViewName("ccloginfail");
	    }
	    return mv;
	  }
	  
	  @GetMapping("coursemapping")
	  public ModelAndView coursemapping(HttpServletRequest request)
	  {
		  ModelAndView mv = new ModelAndView();
		  
		  HttpSession session = request.getSession();
		  
		  List<Instructor> instructors = creatorService.viewAllInstructors();
		  for(Instructor i:instructors) {
			  System.out.println(i.getId());
		  }
		 // mv.addObject("instructors", instructors);
		  session.setAttribute("instructors", instructors);
		  
		  List<Course> courses = creatorService.viewAllCourses();
		  for(Course c:courses) {
			  System.out.println(c.getCourseid());
		  }
		  //mv.addObject("courses", courses);
		  session.setAttribute("courses", courses);

		  mv.setViewName("cc-instructorcoursemapping");
		  return mv;
	  }
	  
	  @PostMapping("/mapInstructorToCourse")
	  public ModelAndView mapInstructorToCourse(HttpServletRequest request) {
	      ModelAndView mv = new ModelAndView();

	      try {
	          int courseId = Integer.parseInt(request.getParameter("courseid"));
	          int instructorId = Integer.parseInt(request.getParameter("instructorid"));

	          InstructorCourseMapping mapping =new InstructorCourseMapping();
	          mapping.setCourseid(courseId);
	          mapping.setInstructorid(instructorId);

	          creatorService.addCourseMapping(mapping);

	          mv.addObject("message", "Instructor successfully mapped to course!");
	          mv.addObject("alertClass", "alert-success");
	      } catch (Exception e) {
	          mv.addObject("message", "Error occurred while mapping instructor to course.");
	          mv.addObject("alertClass", "alert-danger");
	      }

	      List<Instructor> instructors = creatorService.viewAllInstructors();
	      mv.addObject("instructors", instructors);

	      List<Course> courses = creatorService.viewAllCourses();
	      mv.addObject("courses", courses);

	      mv.setViewName("cc-instructorcoursemapping");
	      return mv;
	  }
	  
	  @GetMapping("/viewAllMappings")
	  public ModelAndView viewAllMappings(HttpServletRequest request) {
	      ModelAndView mv = new ModelAndView();

	      try {
	          HttpSession session = request.getSession();

	          // Retrieve all instructor-course mappings
	          List<InstructorCourseMapping> mappings = creatorService.viewAllMappings();
	          session.setAttribute("mappings", mappings);
	          
	          List<Instructor> instructors = creatorService.viewAllInstructors();
	          session.setAttribute("instructors", instructors);

	          List<Course> courses = creatorService.viewAllCourses();
	          session.setAttribute("courses", courses);

	          session.setAttribute("message", "Mappings retrieved successfully.");
	          session.setAttribute("alertClass", "alert-success");

	          mv.setViewName("cc-viewallmapping");
	      }
	      catch (Exception e) 
	      {
	          HttpSession session = request.getSession();
	          session.setAttribute("message", "Error occurred while fetching mappings.");
	          session.setAttribute("alertClass", "alert-danger");
	          mv.setViewName("error");
	      }

	      return mv;
	  }


	  
	  @GetMapping("cclogout")
	  public ModelAndView cclogout(HttpServletRequest request)
	  {
		   HttpSession session = request.getSession();
		   
		   session.removeAttribute("cc"); 
		     
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("index");
		   return mv;
	  }
	  @GetMapping("ccsessionexpiry")
	  public ModelAndView ccsessionexpiry()
	  {
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("sessionexpiry");
		   return mv;
	  }
	  
	  
	  @GetMapping("addcourse")
	   public ModelAndView addcourse()
	   {
		   ModelAndView mv = new ModelAndView("cc-addcourse");
		   return mv;
	   }
	  @PostMapping("insertcourse")
	   public ModelAndView insertcourse(HttpServletRequest request,@RequestParam("courseimage") MultipartFile file) throws Exception
	   {
		   String msg = null;
		   
		   ModelAndView mv = new ModelAndView();
		   
		   try
		   {
		   String title = request.getParameter("title");
		   String desc = request.getParameter("desc");
		   String duration = request.getParameter("duration");
		   
			  byte[] bytes = file.getBytes();
			  Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
			  //  creates a Blob object in Java from a byte array (bytes).
			  
			  Course c = new Course();
			  c.setCoursetitle(title);
			  c.setCoursedescription(desc);
			  c.setCourseduration(duration);
			  c.setImage(blob);
			  
			  msg=creatorService.AddCourse(c);
			  System.out.println(msg);
			  mv.setViewName("cc-addcourse");
              mv.addObject("successMessage", "Course added successfully!");
		   }	  
		   catch(Exception e)
		   {
			   msg = e.getMessage();
			   System.out.println(msg.toString());
		        mv.setViewName("cc-addcourse");
		        mv.addObject("errorMessage", "Error occurred while adding the course.");
		   }
		   return mv;
	   }

	  // *************STUDENT****************
	  
	  @GetMapping("viewallstud") 
	  public ModelAndView viewallstud()
	  { 
	    ModelAndView mv = new ModelAndView(); 
	    List<Student> studentlist = creatorService.ViewAllStud(); 
	    mv.setViewName("cc-viewallstudents"); 
	    mv.addObject("studentlist",studentlist); 
	    return mv;
	  } 
	  
	  // *************INSTRUCTOR****************

	  
	  @GetMapping("viewallinstr") 
	  public ModelAndView viewallinstr()
	  { 
	    ModelAndView mv = new ModelAndView(); 
	    List<Instructor> instructorlist = adminService.ViewAllInstructors(); 
	    mv.setViewName("cc-viewallinst"); 
	    mv.addObject("instructorlist",instructorlist); 
	    return mv;
	  } 
	  	  
	  
	  @GetMapping("viewallcours")
	  public ModelAndView viewallcours()
	  {
		   List<Course> courselist = creatorService.viewAllCourses();
		   
		   ModelAndView mv = new ModelAndView("cc-viewallcourses");
		   
		   mv.addObject("courselist", courselist);
		   
		   return mv;
	  }
	  
	  @GetMapping("displaycoursimage")
	  public ResponseEntity<byte[]> displaycoursimage(@RequestParam int id) throws Exception
	  {
	    Course course =  creatorService.ViewCourseByID(id);
	    byte [] imageBytes = null;
	    imageBytes = course.getImage().getBytes(1,(int) course.getImage().length());

	    return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
	    
	  // Response Body, HTTP Status Code, Headers
	  }
}
