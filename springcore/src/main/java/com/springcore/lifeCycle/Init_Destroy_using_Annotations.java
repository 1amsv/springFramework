package com.springcore.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Init_Destroy_using_Annotations {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Init_Destroy_using_Annotations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("ANNOTATION Starting method Init");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ANNOTATION Ending method destroy");
	}
	
	
}
