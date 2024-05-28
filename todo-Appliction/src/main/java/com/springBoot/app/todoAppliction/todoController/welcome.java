package com.springBoot.app.todoAppliction.todoController;



import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class welcome {

	@RequestMapping("/")
	public String welcomePage(ModelMap model) {
		model.addAttribute("name",getLogginUserName() );
		System.out.println("this method is hetting   "+getLogginUserName());
		return "welcome";
	}

	public String getLogginUserName() {
	    Authentication authentication  =SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}

}
