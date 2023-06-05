package com.jsp.relationship;

/**
 * @author Hp
 *
 */
public class Ticket {
private String movieName;
private  int NoOfTicket;

public Ticket(String movieName,int NoOfTicket) {
	this.movieName=movieName;
	this.NoOfTicket=NoOfTicket;
	
	
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public int getNoOfTicket() {
	return NoOfTicket;
}
public void setNoOfTicket(int noOfTicket) {
	NoOfTicket = noOfTicket;
}
public void printTicketDetails() {
	System.out.println("===========TiCKET=========");
	System.out.println(movieName );
	System.out.println(NoOfTicket);
}

}
