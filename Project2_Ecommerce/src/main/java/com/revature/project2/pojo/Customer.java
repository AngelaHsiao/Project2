package com.revature.project2.pojo;

public class Customer {
private int id;
private String firstName;
private String lastName;
private String userName;
private String password;
private String email;
private String phoneNumber;
private double balance;
public Customer() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	if (balance >=0)
		this.balance = balance;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
			+ ", password=" + password + ", email=" + email + ", phoneNumber=" + phoneNumber + ", balance=" + balance
			+ "]";
}


}
