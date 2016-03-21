package com.cj.java1;

public class TestAnimal {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		// a1.name ="";
		// a1.legs = 4;
		a1.color = "white";
		a1.info();
		a1.eat();
		a1.setLegs(4);
		a1.setName("doudou");
		a1.info();
		a1.setLegs(3);

	}
}

class Animal {

	private String name;
	private int legs;
	String color;
	public double weight;

	public void eat() {
		System.out.println("eating");
	}

	public void sleep() {
		System.out.println("sleeping");
	}

	public void info() {
		System.out.println("name: " + name + "legs: " + legs);

	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int l) {
		if (l > 0 && l % 2 == 0) {
			legs = l;
		} else {
			System.out.println("Wrong number of legs!");
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;

	}

}