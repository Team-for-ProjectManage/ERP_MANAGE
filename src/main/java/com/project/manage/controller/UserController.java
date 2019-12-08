package com.project.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.oa.manage.common.Result;
import com.project.manage.service.IUserService;

@RestController
@RequestMapping(value = "/oa")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/find",method = RequestMethod.GET)
	public Result findAll() {
		return userService.findAll();
	}
	

	@RequestMapping(value = "/hellopage",method = RequestMethod.GET)
	public ModelAndView helloPage(ModelAndView mv) {
		mv.setViewName("index");
		return mv;

	}
	
	
}
