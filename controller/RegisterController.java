package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Register;
import com.niit.model.Role;
import com.niit.model.User;
import com.niit.service.RegisterService;
import com.niit.service.UserLogService;

@Controller
public class RegisterController {
		

	
	
	 @Autowired 
	RegisterService registerService;
	 @Autowired
	 UserLogService userService;

	/*
	 * @RequestMapping(value = "/") public String get() { return "Home"; }
	 */
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
		public ModelAndView register() {
			
			ModelAndView model = new ModelAndView("Registration");
			model.addObject("register",new Register());
			return model;
		}
	
		
 @RequestMapping(value= {"/savereg"}, method=RequestMethod.POST)
 public ModelAndView savereg(@ModelAttribute("register") Register register,ModelMap mp){
	 registerService.saveOrUpdate(register);
     mp.addAttribute("registerForm",register);
     String email = register.getEmail();
     String pwd = register.getPassword();
     User user = new User();
     user.setUserid(email);
     user.setPwd(pwd);
     Role role = new Role();
	 role.setRoleid(2);
	 role.setDescription("user" );
	 user.setRole(role);
	 userService.add(user);
  return new ModelAndView("redirect:/logins");
 }

	
	
//	  @RequestMapping(value = "/logins", method = RequestMethod.POST) public
//	  ModelAndView login() {
//	  
//	  ModelAndView model = new ModelAndView("Login");
//	  
//	  return model; }
	 

	  	 

	  
}
