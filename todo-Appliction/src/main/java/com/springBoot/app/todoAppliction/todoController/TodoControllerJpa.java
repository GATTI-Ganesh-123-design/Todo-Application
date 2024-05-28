package com.springBoot.app.todoAppliction.todoController;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springBoot.app.todoAppliction.todoEntity.Todo;
import com.springBoot.app.todoAppliction.todoEntity.TodoRepository;
import com.springBoot.app.todoAppliction.todoService.TodoService;

import jakarta.validation.Valid;

@Controller
public class TodoControllerJpa {

	
	
	@Autowired
	private TodoRepository todoRepo;
	
	@RequestMapping("/list-Todo")
	public String listTodos(ModelMap model) {
		String name =getLogginUserName();
		List<Todo> todos=todoRepo.findByName(name);
		model.addAttribute("todos",todos);
		
		return "listTodos";
	}
	@RequestMapping( value="/add-todo", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String name =getLogginUserName();
		Todo todo =new Todo(0, name, "", LocalDate.now(), false);
		model.addAttribute("todo", todo);
		return "addTodo";
	}
	
//	@RequestMapping( value="/add-todo", method = RequestMethod.POST)
//	public String showAllTodos(@RequestParam String descrption,@RequestParam LocalDate targetDate, ModelMap model ) {
//		String name =getLogginUserName();
//		service.addTodo(name, descrption, targetDate, false);
//		return "redirect:list-Todo";
//	}
	
	@RequestMapping( value="/add-todo", method = RequestMethod.POST)
	public String showAllTodos(ModelMap model,@Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "addTodo";
		}
		String name =getLogginUserName();
		todo.setName(name);
		todoRepo.save(todo);
		//service.addTodo(name, descrption, targetDate, false);
		return "redirect:list-Todo";
	}
	
	@RequestMapping( value="/delete-todo")
	public String deleteTodo(@RequestParam int id) {
		//service.deleteById(id);
		todoRepo.deleteById(id);
		return "redirect:list-Todo";
	}
	@RequestMapping( value="/update-todo",method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo =todoRepo.findById(id).get();
		model.addAttribute("todo", todo);
		return "addTodo";
	}
	
	@RequestMapping( value="/update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model,@Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "addTodo";
		}
		String name =getLogginUserName();
		todo.setName(name);
		todoRepo.save(todo);
		//service.addTodo(name, descrption, targetDate, false);
		return "redirect:list-Todo";
	}
	public String getLogginUserName() {
	    Authentication authentication  =SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
