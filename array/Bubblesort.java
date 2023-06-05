package com.jsp.array;

public class Bubblesort {
public static void main(String[] args) {
	int a[]= {3,25,45,29,76,10,5};
	for(int i=0;i<a.length -1; i++) {
		for (int j=0;j<a.length-1-i; j++) {
		if(a[j]>a[j+1])
		{ 
			int temp= a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}}}
	
			for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+"  ");
	}
		}
		
	}
