package com.cj.java1;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		//p.setAge(150);
		p.setAge(100);
		System.out.println(p.getAge());
		p.info();
	}
}

class Person {
	private int age;

	public void setAge(int i) {
		if (i > 0 && i < 130) {
			age = i;
		} else {
			//System.out.println("Wrong number of age!");
			throw new RuntimeException("Wrong number of age");
		}
	}

	public int getAge() {
		return age;
	}

	public void info() {
		System.out.println("Age: " + age);
	}
}
