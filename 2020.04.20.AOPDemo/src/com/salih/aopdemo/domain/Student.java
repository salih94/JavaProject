package com.salih.aopdemo.domain;

import org.springframework.stereotype.Component;

@Component
public class Student {
		
	private String firstName;

	private String lastName;
	
	public String getFirstName() {
		System.out.println("firstName Get Methodu Çalýþtý");
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("lastName Get Methodu Çalýþtý");
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student() {
		firstName="Muhammed";
		lastName="Alper";
	}
	
	
}
