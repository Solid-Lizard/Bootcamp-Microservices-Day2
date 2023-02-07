package com.nttdata.bootcamp.microservicesday2.proxy;

public abstract class PersonAbstractProxy implements PersonaProxyI{
	PersonaProxyI person;
	
	public PersonAbstractProxy (PersonaProxyI person) {
		this.person = person;
	}
	
	public void operacion() {
		before();
		System.out.println("Operación");
		after();
	}
	
	public abstract void before();
	
	public abstract void after();

}
