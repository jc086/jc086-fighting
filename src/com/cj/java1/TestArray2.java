package com.cj.java1;

public class TestArray2 {
        public static void main(String[] args) {
			
        	int[] scores =new int[7];
        	
        	int[][] scores1;
        	scores1 =new int[][]{{1,2,3,4},{1,2,3},{6,7,8}};//静态初始化
        	
        	String[][] names;
        	names =new String[5][3];//动态初始化1
        	
        	names =new String[3][];
        	names[0] =new String[5];
        	names[1] =new String[4];
        	names[2] =new String[7];//动态初始化2
        	
        	
        	int[][] i=new int[3][2];
        	i[1][0] =78;
        	i[2][1] =99;
        	
        	System.out.println(i.length);
        	System.out.println(i[1].length);
        	System.out.println(names.length);
        	System.out.println(names[0].length);
        	
        	System.out.println();
        	
        	for(int a=0; a<scores1.length;a++){
        
        		for(int b=0;b<scores1[a].length;b++){
        		    System.out.print(scores1[a][b]+ " ");	
        		}
        		System.out.println();
        	}
        	
        	
        	
		}
}
