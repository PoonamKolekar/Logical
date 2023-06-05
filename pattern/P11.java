package com.jsp.pattern;

import java.util.Scanner;
//TO PRINT 1 00 111 0000 1111 VERTICALLY


public class P11 {
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int n=sc.nextInt();
		    for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i% 2==0) {
		     System.out.print("0");
			} else {
				System.out.print("1 ");	
			}
		      
			}
			System.out.println();

}
}
	}

//1 
//00
//1 1 1 
//0000
//1 1 1 1 1 
