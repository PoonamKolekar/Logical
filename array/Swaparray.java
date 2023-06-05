package com.jsp.array;

public class Swaparray {
public static void main(String[] args) {
	int a[]= {7,4,9,8,2,1,3,0};
	int l=a.length-1;
	for (int i=0; i<a.length/2;i++) {
		int temp= a[l];
		a[l]=a[i];
		a[i]=temp;
		l--;	
	}
	for (int i=0;i<a.length;i++) {
		System.out.print(a[i]+ "");
	}
	
	
	
}
		
}
