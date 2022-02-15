package com.example.demo;

public class Student {
	
	private String Name;
	private String Age;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Age=" + Age + "]";
	}
	
	
	
	

}
