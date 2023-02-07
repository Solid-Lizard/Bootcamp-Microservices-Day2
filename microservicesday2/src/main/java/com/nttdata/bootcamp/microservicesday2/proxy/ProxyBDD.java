package com.nttdata.bootcamp.microservicesday2.proxy;

public class ProxyBDD extends PersonAbstractProxy {	
	
	public ProxyBDD(PersonaProxyI person) {
		super(person);
	}


	@Override
	public void before() {
		System.out.println("Before");
		
	}

	@Override
	public void after() {
		System.out.println("After");
		
	}
	
	

}
