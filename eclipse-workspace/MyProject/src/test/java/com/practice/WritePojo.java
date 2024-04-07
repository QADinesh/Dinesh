package com.practice;

import java.util.ArrayList;

public class WritePojo {
	private String name;
	private int age;
	private String city;
	private boolean result;
	private float percentage;
	private WritePojo2 sub;
	private ArrayList<String> courses;
	public WritePojo(String name, int age, String city, boolean result, float percentage, WritePojo2 sub,
			ArrayList<String> courses) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.result = result;
		this.percentage = percentage;
		this.sub = sub;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	public boolean isResult() {
		return result;
	}
	public float getPercentage() {
		return percentage;
	}
	public WritePojo2 getSub() {
		return sub;
	}
	public ArrayList<String> getCourses() {
		return courses;
	}
	
}
