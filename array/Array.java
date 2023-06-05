package com.jsp.array;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("enter the size of array");
	int s = sc.nextInt();
	int a[]=new int [s];
	//to print index
	for(int i=0; i<a.length;i++) {
		System.out.println(i+"");
	}
	
System.out.println();	
	
	//to take userinput 
for (int i=0 ;i< a.length-1; i++) {
	System.out.println("enter the value of index");
	int n= sc.nextInt();
	a[i]=n;
	
}
	//to print values of the corresponding index
for (int i=0;i<a.length;i++) {
	System.out.print(a[i]+ "");
}
	
	
}
}
