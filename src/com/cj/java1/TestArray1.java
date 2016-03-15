package com.cj.java1;

public class TestArray1 {
      public static void main(String[] args) {
		
    	  int[] i= new int[]{15,17,47};
    	  int[] j=new int[6];
    	  
    	  for(int t=0;t<i.length;t++){
    		  j[t]=i[t];
    	  }
    	  
    	  j[3]=12;
    	  j[4]=13;
    	  
    	  for(int t=0;t<j.length;t++){
    		  
    		  System.out.println(j[t]);
    	  }
	}
}
