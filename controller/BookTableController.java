package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.BookTable;
import com.niit.service.CustomerService;

@Controller
//@RequestMapping(value="/customer")
public class BookTableController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/")
	public String get() {
		return "Login";
	}

	@RequestMapping(value = "/checkbook", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("Check");
		@SuppressWarnings("unchecked")
		List<BookTable> list = customerService.listAllCustomers();
		model.addObject("list", list);
		return model;
	}

	@RequestMapping(value = "/updatebook/{id}", method = RequestMethod.GET)

	public ModelAndView update(@PathVariable("id") int id) {

		ModelAndView model = new ModelAndView("BookTable");
		BookTable customer = customerService.findCustomerById(id);
		model.addObject("customer", customer);
		
		return model;

	}

	@RequestMapping(value = "/deletebook/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id) {
		customerService.deleteCustomer(id);

		return new ModelAndView("redirect:/checkbook");
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		// ModelAndView model = new ModelAndView("addCust","command",new Customer());
		ModelAndView model = new ModelAndView("BookTable");
		return model;
	}
	
 @RequestMapping(value= {"/save"}, method=RequestMethod.POST)
 public ModelAndView save(@ModelAttribute("customer") BookTable customer,ModelMap mp){
	 customerService.saveOrUpdate(customer);
     mp.addAttribute("customerForm",customer);
  
  return new ModelAndView("redirect:/checkbook");
 }

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("Home");

		return model;
	}

	
	  @RequestMapping(value="/booktable", method=RequestMethod.GET) 
	  public ModelAndView booktable(ModelMap m)
	  {
		  ModelAndView model = new ModelAndView("BookTable");
		  model.addObject("customer",new BookTable());
		  
	  
	  return model; }
	  
	  
	  
	
	  
	  @RequestMapping(value = "/about", method = RequestMethod.GET)
		public ModelAndView about() {
			
			ModelAndView model = new ModelAndView("About");

			return model;
		}
	  
	  
	  
	  

}
