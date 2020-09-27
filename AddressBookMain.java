package com.academy.AddressBookMain;

public class AddressBookMain {

	public static void main(String[] args) {
		// Displaying Welcome message
		
		System.out.println(".....Welcome to Address book....");
		Contacts contact = new Contacts("Shubham", "Gaya", " Bihar", 823001, 9999992222l);
		contact.display();

	}

}
