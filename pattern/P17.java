package com.jsp.pattern;

import java.util.Scanner;

public class P17 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			char ch='A';
		for(int j= 1;j<=i;j++){
				if(j==1|| j==i||j==n) {
					System.out.print("*");
				} else {
					System.out.print(" ");	
				}
			      
				}
				System.out.println();
				}
			}
		}
		

