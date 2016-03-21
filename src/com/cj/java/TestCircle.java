package com.cj.java;

public class TestCircle {
	public static void main(String[] args) {
		PassObject p = new PassObject();
		Circle c = new Circle();
		p.printArea(c, 5);

		System.out.println("Now radius is " + c.getRadius());
	}
}

class PassObject {
	public void printArea(Circle c, int time) {
		System.out.println("Radius" + "\t\t" + "Area");
		// int temp = 0;
		// for (int i = 1; i <= time; i++, temp = i) {
		// c.setRadius(i);
		// System.out.println(c.getRadius() + "\t\t" + c.findArea());
		// }
		// c.setRadius(temp);
		int i = 1;
		while (i <= time) {
			c.setRadius(i);
			System.out.println(c.getRadius() + "\t\t" + c.findArea());
			i++;
		}
		c.setRadius(i);
	}
}

class Circle {
	double radius;

	public double findArea() {
		return radius * radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		radius = r;
	}

}