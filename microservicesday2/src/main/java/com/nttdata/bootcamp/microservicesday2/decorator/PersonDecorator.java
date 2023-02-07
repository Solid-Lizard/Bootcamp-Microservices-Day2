package com.nttdata.bootcamp.microservicesday2.decorator;

public class PersonDecorator implements PersonInterface{	
	private PersonInterface person;
	
	public PersonDecorator (PersonInterface person) {
		this.person = person;
	}
	
	protected PersonInterface getPerson() {
		return person;
	}
	
	@Override
	public String getName() {
		return person.getName();
	}
	
	@Override
	public int getAge() {
		return person.getAge();
	}
	
}
