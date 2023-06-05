package com.jsp.pattern;


public class P15 {
public static void main(String[]args) {
	System.out.println("enter number");
	int n=5;
	int temp=n;
	for(int i=1;i<=n;i++){
	
	for(int j=1;j<=i;j++) {
	
	System.out.print((char)('A'+temp+j-2));
	}System.out.println();


	temp--;
	} 


System.out.println();

}


}

