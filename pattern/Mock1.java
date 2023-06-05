package com.jsp.pattern;

import java.util.Scanner;

public class Mock1 {
	public static void main(String[]args) {

		Scanner sc=new Scanner(System.in);                                                                                                      
		System.out.println("enter number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			//for spaces
			for(int s=1;s<i;s++) {
				System.out.print(" ");
			}
			//for star
			
		for(int j=1;j<=n;j++){
		if(j>=i)
	     System.out.print("*");
		
		}
		  System.out.println();
				}   
				
				}
				}

			



