package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Role;
import com.niit.model.User;
import com.niit.service.UserLogService;
@Controller
public class HomeController {

	@Autowired
	UserLogService userService;
	
	@RequestMapping("/logins")
	public ModelAndView signIn()
	{
		ModelAndView mv = new ModelAndView("Login");
		return mv;
		
	}
	
	@RequestMapping("/submit")
	public ModelAndView submit(@RequestParam("userid") String userid, @RequestParam("pwd") String pwd)
	{
		User user = userService.findById(userid);
		ModelAndView mv = new ModelAndView();
		if(user!=null)
		{
		String uid=	user.getUserid();
	    String pswd=user.getPwd();	    
		
		if(uid.equals(userid) && pswd.equals(pwd)) 
		{
			
			userService.update(user);
			mv.setViewName("Home");
			
		}
		
		else 
			mv.setViewName("Login");
		
		}
		else
			mv.setViewName("Login");
		return mv;
		
	}	
	
	
	
}
