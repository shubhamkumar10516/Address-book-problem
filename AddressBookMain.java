package com.academy.AddressBookMain;

import java.util.*;
public class AddressBookMain {

	public static void main(String[] args) {
		// Displaying Welcome message
		
		System.out.println(".....Welcome to Address book....");
		
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
		//contact.display();
		AddressBook addBook = new AddressBook();
		addBook.addContact(contact);
		
		System.out.println("Edit:: Enter 1. for name\n 2. for city \n 3. for state::  ");
		
		int ch = sc.nextInt();
		
		switch(ch) {
		
		case 1:
			  sc.nextLine();
		      name = sc.nextLine();
		      break;
		case 2:
			  sc.nextLine();
		      city = sc.nextLine();
		      break;
		case 3:
			  sc.nextLine();
		      state = sc.nextLine();
		      break;
		}
		
		
		 
		
		contact = new Contacts(name, city, state, zip , ph);
		
		addBook.editContact(contact);
		contact.display();
		

	}

}
