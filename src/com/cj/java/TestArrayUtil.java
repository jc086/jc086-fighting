package com.cj.java;

public class TestArrayUtil {

	public int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;

	}

	public void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("]");
	}

	public int avg(int[] arr) {
		// int sum = 0;
		// for(int i = 0; i<arr.length; i++){
		// sum += arr[i];
		// }
		// return sum/arr.length;
		//

		int sum = getSum(arr);
		return sum / arr.length;

	}

	public int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public int[] reverse(int[] arr) {
		for (int x = 0, y = arr.length-1; x < y; x++, y--) {
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		return arr;
	}

	public int[] copy(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}

	public void sort(int[] arr, String desc) {
		if (desc == "esc") {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						// int temp = arr[j];
						// arr[j] = arr[j + 1];
						// arr[j + 1] = temp;
						swap(arr, j, j + 1);
					}
				}
			}
		} else if (desc == "desc") {
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] < arr[j + 1]) {
						// int temp = arr[j];
						// arr[j] = arr[j + 1];
						// arr[j + 1] = temp;
						swap(arr, j, j + 1);
					}
				}
			}
		} else {
			System.out.println("Have wrong!");
		}

	}

	public void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
