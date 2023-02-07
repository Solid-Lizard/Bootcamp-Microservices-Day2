package com.nttdata.bootcamp.microservicesday2.cadenademando;

import java.util.ArrayList;
import java.util.List;

public class UnidadDeMando {
	List<Unidad> ejercito;
	String orden;
	
	public UnidadDeMando(String orden) {
		ejercito = new ArrayList<Unidad>();
		this.orden = orden;
	}
	
	public void annadirEjercito(Unidad unidad) {
		ejercito.add(unidad);
	}
	
	public void ejecutarOrden() {
		ejercito.get(0).ejecutarOrden(orden);
	}
}
