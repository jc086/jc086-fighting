package com.cj.java1.exer;
/*
 * .(1)定义类Pritimive，在类中定义一个有3个元素的boolean类型的数组t作为其成员变量。数组元素未赋值。
	定义类(Array1)TestPritimive，在Array1的main()方法中创建Pritimive对象d，输出其成员变量t的三个元素值。
	练习目的：检验基本数据类型数组创建时的自动赋值。
   (2)给对象d的成员变量t赋值为{true,true,true}，并输出t的三个元素值。
 */
public class TestPritimive {

       public static void main(String[] args) {
    	   
		Pritimive d = new Pritimive();
		
		for(int i=0;i<d.t.length;i++){
			System.out.println(d.t[i]);
			
		}
		
		d.t[0]=true;
		d.t[1]=true;
		d.t[2]=true;
		for(int i=0;i<d.t.length;i++){
			System.out.println(d.t[i]);
		}
	}	
}

class Pritimive{
	
	boolean[] t=new boolean[3];
	
}