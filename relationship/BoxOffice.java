package com.jsp.relationship;
import java.util.Scanner;


public class BoxOffice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	Theatre theatre =new Theatre();
		boolean flag =true;
		while(flag) { 
			System.out.println("enter the avilabiltiy status"+"2. book your ticket"+"3.show booking status"+"4.cancel ticket"+"5.exit");
			int chioce=sc.nextInt();
			switch (choice) {
			case 1:{
				theatre.checkAvailability();
				
			}break;
			case 2:{
				System.out.println("enter te no of seats");
				int sears=sc.nextInt();
				System.out.println("enter the movie name");
				String movie=sc.next();
						theatre.setTicket(new Ticket());
				theatre.bookTicket();
			}break;
			case 3:{
				
				theatre.ShowDetails();
				
			}break;
			case4:{
				System.out.println("enter the no");
				int cancel=sc.nextInt();
			
				
			}break;
			deafault:{
				System.out.println("wrong input");
			}
			}
			
		
		
		
		}
	}
}
