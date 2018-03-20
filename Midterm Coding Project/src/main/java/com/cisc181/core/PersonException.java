package com.cisc181.core;

public class PersonException extends Exception{ 
	private Person a;
	
	
	public PersonException(Person a, String error) {
		super(error);
		this.a = a;
	    }
}
