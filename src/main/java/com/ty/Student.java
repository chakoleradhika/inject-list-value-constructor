package com.ty;

import java.util.List;

public class Student {
	private String name;
	private List<String> subject;

	public Student(String name, List<String> subject) {
		super();
		this.name = name;
		this.subject = subject;
	}

	public void display() {
		System.out.println("Student NAme : " + name);
		System.out.println("=====Subject=========");
		for (String sub : subject) {
			System.out.println("Subject Name  : " + sub);
		}
	}

}
