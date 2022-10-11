package com.test02.model.dto;

public class Person {
	//필드
	private String name;
	private int age;
	private double height;
	
	//생성자
	public Person() {}
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//getter & setter
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String information() {
		return "name="+name+", age"+age+", height"+height;
	}
	
	
	
	
	
}
