package com.crazytd.springstaff.controller;

import com.crazytd.springstaff.entity.Message;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@RequestMapping("/")
	public ModelAndView index(ModelAndView modelAndView){
		Message message = new Message("SHOCK","This is a shock new that i`m iron man","e");
		modelAndView.addObject("msg",message);
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping("/chatDemo")
	public ModelAndView chatDemo(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("chatDemo");
		return modelAndView;
	}
}
