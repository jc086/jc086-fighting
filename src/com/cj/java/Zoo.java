package com.cj.java;

public class Zoo {
	public static void main(String[] args) {

		Animal a = new Animal();
		a.name = "xiongda";
		a.age = 6;
		a.setName("xionger");

	}
}

class Animal {

	String name;
	int age;

	public void eat() {

		System.out.println("animal eat");

	}

	public void sleep() {

		System.out.println("animal sleep");
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
		System.out.println("name " + name + " age:" + age);

	}
}
