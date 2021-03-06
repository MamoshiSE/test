package Libary;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
	public static AtomicInteger count = new AtomicInteger(0);
	private String name;
	private int libaryCard;
	private String phoneNumber;
	private Address address;
	private ArrayList<Books> bookHistory;
	private int debit;
	private static final int DELAY_FEE = 2; 
	 ArrayList<Books> loanedBooks;

	


Customer (String name, String phoneNumber, String streetName, int streetNum, int zipCode, String city, String country) {
	this.name = name;
	this.libaryCard = count.incrementAndGet();
	this.phoneNumber = phoneNumber;
	this.address = new Address(streetName, streetNum, zipCode, city, country);
	this.bookHistory = new ArrayList<Books>();
	this.loanedBooks = new ArrayList<Books>();
	this.debit = 0;
	

}

public void ChargeCustomer(long days)
{
	debit += DELAY_FEE * days;
}

public int getDebit() {
	return debit;
}



public static AtomicInteger getCount() {
	return count;
}




public static void setCount(AtomicInteger count) {
	Customer.count = count;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public int getLibaryCard() {
	return libaryCard;
}




public void setLibaryCard(int libaryCard) {
	this.libaryCard = libaryCard;
}




public String getPhoneNumber() {
	return phoneNumber;
}









public Address getAddress() {
	return address;
}









public ArrayList<Books> getBookHistory() {
	return bookHistory;
}




public void setBookHistory(ArrayList<Books> bookHistory) {
	this.bookHistory = bookHistory;
}




public ArrayList<Books> getLoanedBooks() {
	return loanedBooks;
}




public void addLoanedBooks(Books loanedBook) {
	
	loanedBooks.add(loanedBook);
}

@Override
public String toString() {
	String info = "";
	info += "\n";
	info += "Customer has been registered: " + "\n";
	info += "Name: " + name + "\n";
	info += "Library Card ID: " + libaryCard + "\n";
	info += "Address: " + address + "\n";
	info += "Phone Number: " + phoneNumber;
	return info;
}
	
public String customerInformation() {
	String info = "";
	info += "\n";
	info += "Customer Information: " + "\n";
	info += "Name: " + name + " (ID: " + libaryCard + ")" + "\n";
	info += "Address: " + address + "\n";
	info += "Phone Number: " + phoneNumber + "\n";
	info += "Total Debit: " + debit + " SEK \n";
	info += "Loan History: \n";
	
	return info;
}


}
