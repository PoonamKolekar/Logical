package com.jsp.array;
import java.util.Scanner;

public class Oddcount {
	Scanner sc=new Scanner(System.in);
	
	public void addElement(int arr[]) {
	for(int i= 0;i<arr.length; i++) {
		System.out.println("enter element");
		arr[i]=sc.nextInt();
		
	}
	
	int a= oddCount(arr);
	System.out.println(a);
	}
public int oddCount(int arr[]) {
	int count =0;
	for( int i=0; i<arr.length;i++) {
		if(!(arr[i]%2==0)) {
			count++;
		}
	}
	
	return count;
}

public static void main(String[] args) {
	System.out.println("enter the array size");
	Scanner sc= new Scanner(System.in);
	
	Oddcount oddCount =new Oddcount();
	int n =sc.nextInt();
			int a[]=new int [n];
			oddCount.addElement(a);
	
	
	
	
	
	
	
	
}


}
