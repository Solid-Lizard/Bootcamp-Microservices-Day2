package com.nttdata.bootcamp.microservicesday2.prototype;

public class PersonPrototype implements Cloneable{
	
	// ATRIBUTOS //
	private String name;
	private int age;
	
	// MÉTODOS //
	
	// Constructores //
	public PersonPrototype() {
		
	}
	
	public PersonPrototype(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Getters & Setters // 
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
	
	// Clone //
	@Override
	public Object clone() {
		Object clonado = null;
		
		try {
			clonado = super.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();			
		}
		
		return clonado;		
	}
	
}
