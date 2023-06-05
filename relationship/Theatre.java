package com.jsp.relationship;

public class Theatre {
private String theater_name;
private int seating_capacity;
private Ticket ticket;


	public String getTheater_name() {
	return theater_name;
}
public void setTheater_name(String theater_name) {
	this.theater_name = theater_name;
}
public int getSeating_capacity() {
	return seating_capacity;
}
public void setSeating_capacity(int seating_capacity) {
	this.seating_capacity = seating_capacity;
}
public Ticket getTicket() {
	return ticket;
}
public void setTicket(Ticket ticket) {
	this.ticket = ticket;
}
	//book ticket
	public void bookTicket() {
		if(ticket.getNoOfTicket()!=0 && ticket.getNoOfTicket()<=seating_capacity){
			seating_capacity=seating_capacity-ticket.getNoOfTicket();
			System.out.println("your booking of" +ticket.getNoOfTicket()+"has been booked");
		}else {System.out.println("booking not succssful");
		
			
			
		}
	}
	//check availability
	public void checkAvailability() {
		System.out.println(seating_capacity);
	}
	//cancel
	
	public void cancekTicket(int cancel_tickets) {
		if(cancel_tickets!=0 && cancel_tickets<= ticket.getNoOfTicket()) {
			seating_capacity= seating_capacity+cancel_tickets;
			ticket.setNoOfTicket(ticket.getNoOfTicket()-cancel_tickets);
		
		System.out.println("ticket cancelled");
	}else {
		System.out.println("technical issue");
		}
	}
	
	public  void ShowDetails() {
		System.out.println("your ticket details are as follows");
		System.out.println(ticket.getMovieName());
		System.out.println(ticket.getNoOfTicket());
	}
}



