package com.springBoot.app.todoAppliction.todoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.springBoot.app.todoAppliction.todoEntity.Todo;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	 
	static int todoCount =0;
	static {
		todos.add(new Todo(++todoCount,"gani","learn java",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoCount,"gani","learn python",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++todoCount,"gani","learn aws",LocalDate.now().plusYears(3),false));
		todos.add(new Todo(++todoCount,"dummy","learn somthing",LocalDate.now().plusYears(4),true));
	}

	public List<Todo> findByUseName(String userName){
		Predicate<? super Todo> pridiacte =todo->todo.getName().equalsIgnoreCase(userName);
		return todos.stream().filter(pridiacte).toList();
	}
	
	public void addTodo(String userName, String description, LocalDate targetDate, boolean done){
		
		 todos.add(new Todo(++todoCount,userName,description,targetDate,done));
	}
	
	public void deleteById(int id) {
		Predicate<? super Todo> pridiacte =todo->todo.getId() == id;
		todos.removeIf(pridiacte);
	}
	
	public Todo findById(int id) {
		Predicate<? super Todo> pridiacte =todo->todo.getId() == id;
		Todo todo= todos.stream().filter(pridiacte).findFirst().get();
		
		return todo;
		
	}

	public void updateTodo(int id, String userName, String description, LocalDate targetDate, boolean done) {
		
		deleteById(id);
		todos.add(new Todo(id,userName,description,targetDate,done));
	}
	
	
}
