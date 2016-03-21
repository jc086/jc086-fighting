package com.cj.java;

public class TestOverload {

	public int getSum(int i, int j) {
		return i + j;
	}

	public int getSum(int i, int j, int k) {
		return i + j + k;
	}

	public double getSum(double d1, double d2) {
		return d1 + d2;
	}

	public void getSum(double d1, double d2, double d3) {
		System.out.println(d1 + d2 + d3);
	}

}
