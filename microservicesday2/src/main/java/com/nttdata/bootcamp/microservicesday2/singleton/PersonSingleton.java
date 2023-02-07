package com.nttdata.bootcamp.microservicesday2.singleton;

public class PersonSingleton {
	private String name;
	private int age;
	
	private static PersonSingleton instance = null;
	
	private PersonSingleton(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private PersonSingleton() {
		
	}
	
	public static PersonSingleton getInstance(String name, int age) {
		if (instance == null) {
			instance = new PersonSingleton(name, age);
		}
		
		return instance;
	}

	// Getters y Setters //
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static PersonSingleton getInstance() {
		return instance;
	}

	public static void setInstance(PersonSingleton instance) {
		PersonSingleton.instance = instance;
	}
	
	
	
}
