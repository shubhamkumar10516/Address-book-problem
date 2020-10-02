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
	
    public void deleteContact(String name) {
    	if(hmap.remove(name) == null) 
    		System.out.println("Contact don't exist");
    	else {
    		
    		System.out.println("Contact deleted!!");
    	}
    		
    	
    }
	
	public void editContact(Contacts contact) {
		
		hmap.put(contact.getName(), contact);
		System.out.println("Contact Edited:: ");
	}
	
    public Contacts editContactUsingName(String name) {
		
    	
		  return hmap.get(name);
		
	}
	
    public void display() {
		Iterator hmIterator = hmap.entrySet().iterator();
        while(hmIterator.hasNext()) {
        	Map.Entry mapElements = (Map.Entry)hmIterator.next();
        	String name = (String)mapElements.getKey();
        	Contacts cnt = (Contacts)mapElements.getValue();
        			
        	System.out.println(name +" "+ cnt);
        }
	}
	
}
