package com.cj.java1.exer;
/*
 * .(1)������Pritimive�������ж���һ����3��Ԫ�ص�boolean���͵�����t��Ϊ���Ա����������Ԫ��δ��ֵ��
	������(Array1)TestPritimive����Array1��main()�����д���Pritimive����d��������Ա����t������Ԫ��ֵ��
	��ϰĿ�ģ�������������������鴴��ʱ���Զ���ֵ��
   (2)������d�ĳ�Ա����t��ֵΪ{true,true,true}�������t������Ԫ��ֵ��
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