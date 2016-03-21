package com.cj.java;

public class TestCar {

	public static void main(String[] args) {
		Car c1 = new Car();

		c1.info();
		c1.setName("BMW");
		c1.setWheel(4);
		c1.info();

		Factory f = new Factory();
		Car c2 = f.produceCar();
		f.describeCar(c2);
		Car c3 = f.produceCar("bl", 4);
		f.describeCar(c3);

	}

}

class Car {

	String name;
	int wheel;

	public void info() {

		System.out.println("name: " + name + " wheel: " + wheel);
	}

	public void show() {
		System.out.println("It is a car");
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public void setWheel(int w) {
		wheel = w;
	}

}

class Factory {
	public Car produceCar() {
		return new Car();
	}

	public Car produceCar(String n, int w) {
		Car c = new Car();
		c.name = n;
		c.wheel = w;
		return c;
	}

	public void describeCar(Car c) {
		c.info();

	}

}
