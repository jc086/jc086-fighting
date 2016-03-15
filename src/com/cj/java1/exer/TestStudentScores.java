package com.cj.java1.exer;


import java.util.Scanner;


public class TestStudentScores {
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("请输入学生的个数：");
		int count =s.nextInt();
		int[] scores =new int[count];
		int maxScore =scores[0];
		
		System.out.println("请输入"+count+"个成绩: ");
		
		for(int i=0;i<scores.length;i++){
			
			int score = s.nextInt();
			scores[i]= score;
			if(scores[i] > maxScore){
				
				maxScore=scores[i];
			}
			
		}
		System.out.println("最高分是：" + maxScore);	
	    
		for(int j=0;j<scores.length; j++){
			char level;
			if(scores[j]>=maxScore-10){
				level='A';
			}else if(scores[j]>=maxScore-20){
				level='B';
			}else if(scores[j]>=maxScore-30){
				level='C';
			}else{
				level='D';
			}
			
			System.out.println("Student " + j +" score is " +scores[j] +"grade is" +level);
		 }
			
	}
			
}
				
		

        
        

        
        

