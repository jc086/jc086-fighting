package com.cj.java;

public class TestOop {

	public static void main(String[] args) {

		Person p = new Person();
		p.eat();
		p.sleep();
		p.age = 10;
		p.name = "qiangge";
		p.sex = true;
		p.info();

		p.setName("guangtouqiang");
		p.info();
		System.out.println(p);
		Person p1;
		p1 = p;
		p1.info();
		System.out.println(p1);
		Person p2 = new Person();
		p2.info();
		System.out.println(p2);

	}
}

class Person {
	String name;
	int age;
	boolean sex;

	public void eat() {
		System.out.println("person eat");
	}

	public void sleep() {
		System.out.println("person sleep");
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;

	}

	public void info() {
		// eat();
		// sleep();
		System.out.println(" name: " + name + " age: " + age + " sex: " + sex);
	}
}
