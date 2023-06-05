package com.jsp.pattern;

public class P40 {
	public static void main(String[] args) {
		int n=5;
	int count=1;
		for(int i=1;i<=n;i++ ) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+"");
				if(count%2==0) {
					System.out.print("0");
				}else {System.out.print("1");
				count++;
			}
			System.out.println();
			}}
		
}}
