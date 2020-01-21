package com.niit.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Items;
import com.niit.service.ItemService;
import com.niit.service.OrderService;
@Controller
public class ItemController {

	
	@Autowired
	ItemService itemService;
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value = "/itemmenu", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("Menu");
		@SuppressWarnings("unchecked")
		List<Items> list = itemService.getitem();		
		model.addObject("list", list);
		return model;
	}
	
	
//	 @RequestMapping(value= {"/saveme"}, method=RequestMethod.POST)
//	 public ModelAndView save(@ModelAttribute("items") Items items,ModelMap mp){
//		 itemService.saveOrUpdate(items);
//	     mp.addAttribute("itemForm",items);
//	   return new ModelAndView("redirect:/checkorder");
//	 }
//
	@RequestMapping(value= {"/checkedItems"}, method=RequestMethod.GET)
	public ModelAndView checked(@RequestParam("selectedItems") Integer[] itemid,@RequestParam("qty") Integer[] qtystr)
	{
		Items items = new Items();
		System.out.println(itemid[0]);
		ModelAndView mv = new ModelAndView("OrderCheck");
		for(int x = 0;x<itemid.length;x++)		{
			
				items = itemService.findById(itemid[x]);
				int price = items.getPrice();
				int totalamt = price*qtystr[x];	
				orderService.insertIntoOrder(itemid[x],totalamt,qtystr[x]);
			
		}
		mv.addObject("items",items);
		
		System.out.println("items : "+items.getItemid());
		return mv;
	}
	  
	@RequestMapping(value = "/saveitem", method = RequestMethod.GET)
	public ModelAndView about() {
		
		ModelAndView model = new ModelAndView("OrderCheck");

		return model;
	}

}
