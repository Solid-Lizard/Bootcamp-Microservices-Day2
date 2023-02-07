package com.nttdata.bootcamp.microservicesday2.proxy;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PersonProxyPattern implements PersonaProxyI{
	private String name;
	private int age;
	
	@Override
	public void operacion() {
		System.out.println("Ejecutando operacion");
		
	}
	
}
