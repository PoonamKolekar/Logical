package com.jsp.array;

public class Sort {
public static void main(String[] args) {
	int a[]= {8,4,7,9,2};
	
	for(int i=0;i<a.length-1;i++){
		
	for(int j=i+1;j<a.length;j++){
	if(a[i]>a[j]) 
	{
	int temp =a[j];
	a[j]=a[i];
	a[i]=temp;
	}}}
	
	for (int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	}
	}

