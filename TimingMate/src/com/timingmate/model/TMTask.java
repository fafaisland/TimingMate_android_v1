package com.timingmate.model;

import java.util.Date;

public class TMTask {
	private String title;
	private TMListItem list;
	private double allowedCompletionTime;
	private double totalUsedTime;
	
	private Date creationTime;
	private boolean isFinished;
	
	public TMTask(String title, TMListItem list,double allowedCompletionTime){
		this.title = title;
		this.list = list;
		this.allowedCompletionTime = allowedCompletionTime;
		
		this.totalUsedTime = 0.0;
		this.creationTime = new Date();
		this.isFinished = false;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof TMTask){
			TMTask t = (TMTask)obj;
			if (this.title.equals(t.getTitle()) && 
				this.list.getTitle().equals(t.getList().getTitle()) && 
				this.creationTime.equals(t.getCreationTime())){
				return true;
			}
			else{
				return false;
			}
		}else{
			return true;
		}
	}
	
	//setter and getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public TMListItem getList() {
		return list;
	}

	public void setList(TMListItem list) {
		this.list = list;
	}

	public Date getCreationTime(){
		return creationTime;
	}
	public double getAllowedCompletionTime() {
		return allowedCompletionTime;
	}

	public void setAllowedCompletionTime(double allowedCompletionTime) {
		this.allowedCompletionTime = allowedCompletionTime;
	}

	public double getTotalUsedTime() {
		return totalUsedTime;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}
	
}
