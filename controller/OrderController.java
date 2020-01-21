package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.niit.model.Order;
import com.niit.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping(value = "/checkorder", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("OrderCheck");
		@SuppressWarnings("unchecked")
		List<Order> list = orderService.listAllCustomers(); 
		model.addObject("list", list);
		return model;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id) {

		ModelAndView model = new ModelAndView("OrderCheck");
		Order order = orderService.findCustomerById(id);
		model.addObject("order", order);
		
		return model;

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id) {
		orderService.deleteCustomer(id);

		return new ModelAndView("redirect:/checkorder");
	}
	
	@RequestMapping(value= {"/saveorder"}, method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("order") Order order,ModelMap mp){
		 orderService.saveOrUpdate(order);
	     mp.addAttribute("orderForm",order);
	  
	  return new ModelAndView("redirect:/checkorder");
	 }

	 @RequestMapping(value = "/menu", method = RequestMethod.GET)
		public ModelAndView menu() {
			
			ModelAndView model = new ModelAndView("Menu");

			return model;
		}
	 
	
	 


	 
}
