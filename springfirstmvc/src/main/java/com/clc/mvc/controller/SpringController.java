package com.clc.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.clc.mvc.bean.StudentBean;

@Controller
public class SpringController {
	/*
	 * @RequestMapping("/studentinfo") public ModelAndView showform() { return new
	 * ModelAndView("studentinfo", "command", new StudentBean()); }
	 */

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(StudentBean stud) {
		System.out.println(stud.getStudAge());
		return "studentinfo";
	}
}
