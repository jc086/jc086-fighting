package com.cj.java1;

public class TestArray {
	public static void main(String[] args) {
		
		
		
		
//		引用数据类型的数组--》默认初始化值为null
		String[] str = new String[4];
		
		str[0]="10";
//		str[1]="20";
		str[2]="22";
		str[3]="15";
		for(int i=0;i<str.length; i++){
			System.out.println(str[i]);
		}
		
		
//		1.byte short int long 默认为0
		int[] scores =new int[5];
		scores[0]=12;
		scores[1]=13;
		scores[2]=23;
//		scores[3]=25;
		scores[4]=32;
		
		for(int i=0;i<scores.length;i++){
			System.out.println(scores[i]);
			
		}
		
		
		byte[] scores1 =new byte[5];
		scores1[0]=12;
		scores1[1]=13;
		scores1[2]=23;
//		scores1[3]=25;
		scores1[4]=32;
		
		for(int i=0;i<scores1.length;i++){
			System.out.println(scores1[i]);
			
		}
//		2.float double 0.0
		System.out.println();
		float[] f=new float[3];
		f[0]=2.5F;
		for(int i=0;i<f.length;i++){
			System.out.println(f[i]);
		}
//		3.char  -->" "
		System.out.println();
		char[] ch= new char[4];
		ch[0]=26;
		ch[1]=0;
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
			
		}
//		4.boolean-->false
		System.out.println();
		
		boolean[] b= new boolean[2];
		for(int i=0;i<b.length;i++){
			
			System.out.println(b[i]);
		}
		
		
	}	

}
