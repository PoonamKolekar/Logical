package com.jsp.pattern;

import java.util.Scanner;

public class P13 {
	 public static  void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int n=sc.nextInt();
		
			for(int i=1;i<=n;i++){
				char ch = (char)('A'+i-1 );
			for(int j=1;j<=i;j++){
			
				
				     System.out.print(ch);
				     ch++;
					} 

			
				System.out.println();
			}
			}
}

