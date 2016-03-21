package com.cj.java;

public class TestStduents {

	public static void main(String[] args) {
		Stduents std = new Stduents();
		std.name = "LiLei";
		std.age = 18;
		std.course = "Math";
		std.interest = "swiming";
		std.info();
	}

}

class Stduents {
	String name;
	int age;
	String course;
	String interest;

	public void info() {
		System.out.println("name: " + name + "age: " + age + "course: " + course + "interest: " + interest);
	}

}