package com.springBoot.app.todoAppliction.todoEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Integer>{

	List<Todo> findByName(String name);
 
}