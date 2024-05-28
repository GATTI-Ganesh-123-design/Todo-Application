package com.springBoot.app.todoAppliction.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class lognController {

//	@Autowired
//	private loginAthenticationService authentication;
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String welcomePage(ModelMap model) {
		model.addAttribute("name", "name");
		return "welcome";
	}
//	@RequestMapping(value="login",method = RequestMethod.POST)
//	public String welcomepage(@RequestParam String name,@RequestParam String password, ModelMap model) {
//		
//		if(authentication.loginAthentication(name, password)) {
//			model.addAttribute("name", name);
//			return "hello";
//		}
//		model.addAttribute("errorMessage", "Invalid! Credentials please try again.");
//		return "login";
//	}
}
