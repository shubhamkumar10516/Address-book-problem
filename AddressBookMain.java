package com.academy.AddressBookMain;

import java.util.*;
public class AddressBookMain {

	public static void addContacts(AddressBook addBook){
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter city");
		String city = sc.nextLine();
		
		System.out.println("Enter state");
		String state = sc.nextLine();
		
		
		System.out.println("Enter phone no.");
		long ph = sc.nextLong();
		
		System.out.println("Enter zip");
		int zip = sc.nextInt();
		
		
		Contacts contact = new Contacts(name, city, state, zip , ph);
		
		
		
		addBook.addContact(contact);
        
	}
	
	public static void main(String[] args) {
		// Displaying Welcome message
		Scanner sc = new Scanner(System.in);
		AddressBook addBook = new AddressBook();
		String state;
		String city;
		
		System.out.println(".....Welcome to Address book....");
		
		
		
		System.out.println(" ---press 1 to add contacts and 2 to exit-- ");
		 int op = sc.nextInt();
		 while(op != 2) {
		
		  addContacts( addBook);
		  System.out.println(" ---press 1 to add contacts and 2 to exit-- ");
		  op = sc.nextInt();
		 }
		
		 System.out.println("Display Contacts::");
		 addBook.display();
		 
		 
		 
		System.out.println("Enter name whose contacts to be edited: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		 
		if(addBook.editContactUsingName(name) == null) {
			
			System.out.println("No contacts found");
		    return;	
		}
		
		Contacts contact = addBook.editContactUsingName(name);
		contact = new Contacts(contact.getName(), contact.getCity(), contact.getState(), contact.getZip(), contact.getPhoneNumber());
		
		System.out.println("Edit:: Enter 1. for name\n 2. for city \n 3. for state::  ");
		
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1:
			  sc.nextLine();
		      name = sc.nextLine();
		      contact = new Contacts(name, contact.getCity(), contact.getState(), contact.getZip(), contact.getPhoneNumber());
				
		      break;
		case 2:
			  sc.nextLine();
		      city = sc.nextLine();
		      contact = new Contacts(contact.getName(), city, contact.getState(), contact.getZip(), contact.getPhoneNumber());
				
		      break;
		case 3:
			  sc.nextLine();
		      state = sc.nextLine();
		      contact = new Contacts(contact.getName(), contact.getCity(), state, contact.getZip(), contact.getPhoneNumber());
				
		      break;
		}
		
		
		addBook.editContact(contact);
		contact.display();
		

	}
 }

