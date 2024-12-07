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

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.service.AdminService;
import com.klef.jfsd.sdp.service.InstructorService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {
  
  @Autowired
  private AdminService adminService;
  
  @Autowired
  private InstructorService instructorService;
  
  @GetMapping("/")
  public ModelAndView home()
  {
    ModelAndView mv=new ModelAndView("index");
    return mv;
  }
  
  @GetMapping("adminhome")
  public ModelAndView adminhome()
  {
    ModelAndView mv=new ModelAndView("admin-dashboard");
    return mv;
  }
  
  @GetMapping("adminlogin")
  public ModelAndView adminlogin() 
  {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("admin-login");
    return mv;
  }
  
  @PostMapping("checkAdminLogin")
  //@ResponseBody
  public ModelAndView checkAdminLogin(HttpServletRequest request) 
  {
	   ModelAndView mv = new ModelAndView();
	   String auname=request.getParameter("auname"); 
	   String apassword= request.getParameter("apwd"); 
	   Admin admin= adminService.checkAdminLogin(auname, apassword); 

    if(admin!=null) {
    	
	     HttpSession session = request.getSession();
	   	 session.setAttribute("admin",admin);

	   	 mv.setViewName("admin-dashboard");
    }
    else {
      mv.setViewName("adminloginfail");
      mv.addObject("message","Login Failed!");
    }
    return mv;
  }
  
  @GetMapping("adminlogout")
  public ModelAndView adminlogout(HttpServletRequest request)
  {
	   HttpSession session = request.getSession();
	   session.removeAttribute("admin"); 
	   
	//   session.invalidate(); //remove all session attributes
	   
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("index");
	   return mv;
  }
  
  @GetMapping("sessionexpiry")
  public ModelAndView sessionexpiry()
  {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("sessionexpiry");
	   return mv;
  }
  
  // ************************INSTRUCTOR************************
  
  @GetMapping("viewallinst") 
  public ModelAndView viewallinst()
  { 
    ModelAndView mv = new ModelAndView(); 
    List<Instructor> instructorlist = adminService.ViewAllInstructors(); 
    mv.setViewName("admin-viewallinst"); 
    mv.addObject("instructorlist",instructorlist); 
    return mv; 
  } 
  
  @GetMapping("updateinststatus")
  public String updateinststatus(@RequestParam("id") int iid,@RequestParam("status") String status)
  {
   adminService.updateinststatus(status, iid);
   return "redirect:/viewallinst";
    
  }
  
  @GetMapping("deleteinst")
  public String deleteinst(@RequestParam("id") int iid)
  {
 	 adminService.deleteinstructor(iid);
 	 return "redirect:/viewallinst";
  }
  
  @GetMapping("updateinst")
  public ModelAndView updateinst()
  {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("admin-updateinst");
	   return mv;
  }
  
//  @GetMapping("/updateInstructor")
//  public String updateInstructor(@RequestParam("id") int id, @RequestParam("status") String status, Model model) {
//      // Retrieve instructor by ID
//      Instructor instructor = adminService.getInstructorById(id);
//
//      if (instructor != null) {
//          // Update the instructor's status
//          instructor.setStatus(status);
//          adminService.updateInstructor(instructor);
//
//          // Add a success message
//          model.addAttribute("message", "Instructor status updated successfully.");
//      } else {
//          // Add an error message if the instructor is not found
//          model.addAttribute("error", "Instructor not found.");
//      }
//
//      // Redirect back to the instructor list
//      return "redirect:/admin/instructors";
//  }
  
  
  
  @GetMapping("/updateInstructor")
  public ModelAndView updateInstructor(@RequestParam("id") int id) {
      ModelAndView modelAndView = new ModelAndView("admin-updateinst");
      Instructor instructor=adminService.getInstructorById(id);
      modelAndView.addObject("instructor", instructor);
      
      
      return modelAndView;
  }
  @PostMapping("/updateInstructorDetails")
  public String updateInstructorDetails(HttpServletRequest request) {
      int id = Integer.parseInt(request.getParameter("id"));
      String name = request.getParameter("name");
      String gender = request.getParameter("gender");
      String email = request.getParameter("email");
      String password = request.getParameter("password");
      String contact = request.getParameter("contact");
      String qualification = request.getParameter("qualification");

      Instructor instructor = adminService.getInstructorById(id);

      if (instructor != null) {
          instructor.setName(name);
          instructor.setGender(gender);
          instructor.setEmail(email);
          instructor.setPassword(password);
          instructor.setContact(contact);
          instructor.setQualification(qualification);

          adminService.updateInstructor(instructor);
      }

      return "redirect:/viewallinst";
  }

  
  // ************************STUDENT************************
  
  @GetMapping("viewallstudents") 
  public ModelAndView viewallstudents()
  { 
    ModelAndView mv = new ModelAndView(); 
    List<Student> studentlist = adminService.ViewAllStudents(); 
    mv.setViewName("admin-viewallstudents"); 
    mv.addObject("studentlist",studentlist); 
    return mv;
  } 
  
  @GetMapping("updatestudentstatus")
  public String updatestudentstatus(@RequestParam("id") int iid,@RequestParam("status") String status)
  {
   adminService.updatestudentstatus(status, iid);
   return "redirect:/viewallstudents"; 
  }
  
  @GetMapping("deletestudent")
  public String deletestudent(@RequestParam("id") int iid)
  {
 	 adminService.deletestudent(iid);
 	 return "redirect:/viewallstudents";
  }  
  
  // ************************CONTEN CREATOR************************

  @GetMapping("viewallcc") 
  public ModelAndView viewallcc()
  { 
    ModelAndView mv = new ModelAndView(); 
    List<ContentCreator> cclist = adminService.ViewAllCC(); 
    mv.setViewName("admin-viewallcc"); 
    mv.addObject("cclist",cclist); 
    return mv; 
  } 
  
  @GetMapping("updateccstatus")
  public String updateccstatus(@RequestParam("id") int id,@RequestParam("status") String status)
  {
   adminService.updateccstatus(status, id);
   return "redirect:/viewallcc";
    
  }
  
  @GetMapping("deletecc")
  public String deletecc(@RequestParam("id") int id)
  {
 	 adminService.deletecc(id);
 	 return "redirect:/viewallcc";
  }
  
  @GetMapping("viewallcourses")
  public ModelAndView viewallcourses()
  {
	   List<Course> courselist = adminService.ViewAllCourses();
	   
	   ModelAndView mv = new ModelAndView("admin-viewallcourses");
	   
	   mv.addObject("courselist", courselist);
	   
	   return mv;
  }
  
  @GetMapping("displaycourimage")
  public ResponseEntity<byte[]> displaycourimage(@RequestParam int id) throws Exception
  {
    Course course =  adminService.ViewCourseByID(id);
    byte [] imageBytes = null;
    imageBytes = course.getImage().getBytes(1,(int) course.getImage().length());

    return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
    
  // Response Body, HTTP Status Code, Headers
  }

}