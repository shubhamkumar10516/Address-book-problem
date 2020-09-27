package com.academy.AddressBookMain;

import java.util.*;
public class AddressBook {
   
	private Map<String, Contacts> hmap = new HashMap<>();

	public boolean addContact(Contacts contact) {
		if(hmap.containsKey(contact.getName())) {
			System.out.println("Contacts for this name is already there!!");
			return false;
		}
		
		hmap.put(contact.getName(), contact);
		System.out.println("Contact Added:: ");
		return true;
	}
	public void editContact(Contacts contact) {
		
		hmap.put(contact.getName(), contact);
		System.out.println("Contact Edited:: ");
		//return true;
	}
	
}
