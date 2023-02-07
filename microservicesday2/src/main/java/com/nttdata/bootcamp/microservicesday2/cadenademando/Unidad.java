package com.nttdata.bootcamp.microservicesday2.cadenademando;

public class Unidad {
	Unidad mando;
	String name;
	
	public Unidad(String name, Unidad mando) {
		this.name = name;
		this.mando = mando;
	}	
	
	public void ejecutarOrden(String orden) {
		if (mando != null) {			
			System.out.println("Unidad: " + this.name + ", mandando orden: " + orden + " a " + mando.name);
			
			mando.ejecutarOrden(orden);
			
		} else {
			System.out.println("Unidad soldado ejecutando orden: " + orden);
			
		}
		
	}
	
}
