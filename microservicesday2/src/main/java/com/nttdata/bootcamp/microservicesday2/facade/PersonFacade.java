package com.nttdata.bootcamp.microservicesday2.facade;

import com.nttdata.bootcamp.microservicesday2.builder.Person;

public class PersonFacade {
	private Person p;
	
	public PersonFacade(String name, int age) {
		p = Person.builder().build();
		
		p.setName(name);
		
		if (age<20 || age>30) {
			p.setAge(25);
		} else {
			p.setAge(age);
		}
		
	}

	@Override
	public String toString() {
		return p.getName() + " " + p.getAge();
	}
			
}
