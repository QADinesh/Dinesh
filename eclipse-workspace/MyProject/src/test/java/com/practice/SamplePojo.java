package com.practice;

import java.util.ArrayList;

public class SamplePojo {
	private String name;
	private int age;
	private boolean payment;
	private float amount;
	private Courses courses;
	private ArrayList<String> classes;
	public ArrayList<String> getClasses() {
		return classes;
	}
	public void setClasses(ArrayList<String> classes) {
		this.classes = classes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isPayment() {
		return payment;
	}
	public void setPayment(boolean payment) {
		this.payment = payment;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	
	

}
