package com.jsp.encapsulation;

public class employee {
private String name;
String location;
String education;
double salery;

public void setName(String name) {
	this.name= name;
}
public void setLocation(String location) {
	this.location= location;
}
public void setEducation(String education) {
	this.education= education;
}

public String getName() {
return name;
}
public String getLocation() {
return location;
}
public String getEducation() {
return education;
}
public void setSalery(Double Salery) {
this.salery=salery;


}
public Double getSalery() {
return salery;
}




}