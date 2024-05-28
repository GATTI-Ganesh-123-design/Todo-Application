package com.springBoot.app.todoAppliction.todoEntity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Todo {
	public Todo(){
		
	}

	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	private String descrption;
	private LocalDate targetDate;
	private boolean done;
	public Todo(int id, String name, String descrption, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.name = name;
		this.descrption = descrption;
		this.targetDate = targetDate;
		this.done = done;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", descrption=" + descrption + ", targetDate=" + targetDate + ", done=" + done
				+ "]";
	}
	
	
}
