package com.jsp.pattern;

public class P24 {
public static void main(String[] args) {
	int n=5;
	int count=1;
	for(int i=1;i<=n;i++ ) {
		for(int j=1;j<n;j++) {
			System.out.print(count +" ");
			count++;
			if(count == 10) {
				count=1;
			}
			
		}
		System.out.println();
	}
}
}
