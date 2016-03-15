package com.cj.java;

public class TestArray {
    public static void main(String[] args) {
		int i1=12;
		
		String[] names;
		int scores[];
		//静态初始化
		names= new String[]{"AA","BB","CC"};
		//动态初始化
		scores= new int[4];
		scores[0]=99;
		scores[1]=89;
		scores[2]=88;
		scores[3]=78;
		
		System.out.println(names.length);
		System.out.println(scores.length);
		
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		
		for(int j=0;j<scores.length;j++){
			System.out.println(scores[j]);
		}
		
	}
}
