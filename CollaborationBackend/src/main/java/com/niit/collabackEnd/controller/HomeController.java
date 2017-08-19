package com.niit.collabackEnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome()
    {
    	ModelAndView mv=new ModelAndView("index");
    	return mv;
    }
	
	public HomeController()
	{
		System.out.println("Instantiating Home Controller");
		
	}
	
	/*@RequestMapping("/")
	public String home()
	{
		return "index";
	}*/

}
