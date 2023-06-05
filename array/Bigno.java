package com.jsp.array;

import java.util.Arrays;

public static int largestIndex(int a[]) {
	int largest=0;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]>largest) {
			largest=i;
		}
	}
	return largest;
}
public static int secondLargest(inta[],int largest) {
	int secondLargest=0;
	for(int i=0;i<a.length;i++);
	if(i !=largest) {
		if(a[i]>a[secondLargest]) {
			secondLargest=i;
		}
	}
}
 return secondLargest;
}
public class Bigno {
public static void main(String[] args) {
	int a[]= {4,78,54,36,98};
	int i=largestIndex(a);
	System.out.println(i);
	
}

	
	
}