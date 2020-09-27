package com.academy.AddressBookMain;

public class AddressBookMain {

	public static void main(String[] args) {
		// Displaying Welcome message
		
		System.out.println(".....Welcome to Address book....");
		int ph = Integer.parseInt(args[4]);
		int zip = Integer.parseInt(args[3]);
		Contacts contact = new Contacts(args[0], args[1], args[2], zip , ph);
		contact.display();
		AddressBook addBook = new AddressBook();
		addBook.addContact(contact);
		

	}

}
