package com.timingmate.model;

import java.util.ArrayList;

public class TMListItem {
	private String title;
	private ArrayList<TMTask> tasks;
	
	public TMListItem(String title){
		this.title = title;
	}
	
	public boolean addTask(TMTask task){
		this.tasks.add(task);
		return true;
	}
	
	public boolean removeTask(TMTask task){
		return this.tasks.remove(task);
	}
	
	public boolean equals(Object obj){
		if (obj instanceof TMListItem){
			TMListItem l = (TMListItem)obj;
			if (this.title.equals(l.getTitle()) && this.tasks.equals(l.getTasks())){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	//setters and getters for title and tasks
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<TMTask> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<TMTask> tasks) {
		this.tasks = tasks;
	}
}
