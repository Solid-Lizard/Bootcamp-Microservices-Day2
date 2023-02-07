package com.nttdata.bootcamp.microservicesday2.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nttdata.bootcamp.microservicesday2.prototype.PersonPrototype;
import com.nttdata.bootcamp.microservicesday2.singleton.PersonSingleton;

@Configuration
public class Config {
	
	@Bean
	@Scope (value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PersonPrototype personPrototype() {
		return new PersonPrototype();
	}
	
	@Bean
	@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
	public PersonSingleton personSingleton() {
		return PersonSingleton.getInstance();
	}
	
}
