package com.cj.java;

public class TestArray {
   
	   public static void main(String[] args) {
		
		   int[] arr =new int[]{9,5,-7,-46,41,23,-12,15,2,31};
		   
		   TestArrayUtil au =new TestArrayUtil();
		   
		   au.getMax(arr);
		   
		   au.getSum(arr);
		   
		   au.avg(arr);
		   
		   au.printArray(arr);
		   
		   System.out.println("fanzhuanhou:");
		   
		   au.reverse(arr);
		   
		   au.printArray(arr);
	   
		   au.sort(arr, "desc");
		   
		   au.printArray(arr);
		   
		   
		   
		   
		   
		   
	}
}
