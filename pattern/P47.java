package com.jsp.pattern;

public class P47 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int sp=1 ;sp<=n-i;sp++) {
				System.out.print("_");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}


//____1
//___12
//__123
//_1234
//12345
