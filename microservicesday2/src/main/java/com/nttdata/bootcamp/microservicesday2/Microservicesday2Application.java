package com.nttdata.bootcamp.microservicesday2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.microservicesday2.builder.Person;
import com.nttdata.bootcamp.microservicesday2.cadenademando.Unidad;
import com.nttdata.bootcamp.microservicesday2.cadenademando.UnidadDeMando;
import com.nttdata.bootcamp.microservicesday2.decorator.PersonDecorator;
import com.nttdata.bootcamp.microservicesday2.decorator.PersonInterface;
import com.nttdata.bootcamp.microservicesday2.facade.PersonFacade;
import com.nttdata.bootcamp.microservicesday2.prototype.PersonPrototype;
import com.nttdata.bootcamp.microservicesday2.proxy.PersonAbstractProxy;
import com.nttdata.bootcamp.microservicesday2.proxy.PersonProxyPattern;
import com.nttdata.bootcamp.microservicesday2.proxy.ProxyBDD;
import com.nttdata.bootcamp.microservicesday2.proxy.PersonaProxyI;
import com.nttdata.bootcamp.microservicesday2.singleton.PersonSingleton;

@SpringBootApplication
public class Microservicesday2Application {	
	
	public static void main(String[] args) {
		// Singleton //
		PersonSingleton pSingleton = PersonSingleton.getInstance("Singleton", 20);
		pSingleton.getName();
		pSingleton.getAge();
		
		System.out.println("---SINGLETON--");
		System.out.println(pSingleton.getAge());
		System.out.println(pSingleton.getName());
		System.out.println("");
		
		// Prototype //
		PersonPrototype original = new PersonPrototype("Prototype", 20);
		PersonPrototype cloned = (PersonPrototype) original.clone();
		
		System.out.println("---PROTOTYPE--");
		System.out.println(cloned.getAge());
		System.out.println(cloned.getName());
		System.out.println("");
		
		// Builder //
		Person p = Person.builder().age(20).name("Builder").build();
		p.getAge();
		p.getName();
		
		System.out.println("---BUILDER--");
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println("");
		
		// Decorator //
		PersonInterface personI = (PersonInterface) Person.builder().name("Decorator").age(20).build();
		
		PersonInterface person = new PersonDecorator(personI);
		person.getAge();
		person.getName();
		
		System.out.println("---DECORATOR--");
		System.out.println(person.getAge());
		System.out.println(person.getName());
		System.out.println("");
		
		// Facade //
		PersonFacade facade1 = new PersonFacade("Fachada1", 440);
		
		PersonFacade facade2 = new PersonFacade("Fachada2", 27);
		
		System.out.println("---FACADE--");
		System.out.println(facade1);
		System.out.println(facade2);
		System.out.println("");
		
		// Proxy //
		PersonProxyPattern pProxy = PersonProxyPattern.builder().age(20).name("Santiago").build();		
		PersonAbstractProxy proxyBDD = new ProxyBDD(pProxy);
		
		System.out.println("---PROXY---");
		proxyBDD.operacion();
		System.out.println("");
		
		// Cadena de mando //
		UnidadDeMando centro = new UnidadDeMando("Harakiri");
		
		Unidad u1 = new Unidad("Soldado", null);
		Unidad u2 = new Unidad("Capitan", u1);		
		Unidad u3 = new Unidad("Comandante", u2);
				
		centro.annadirEjercito(u3);
		centro.annadirEjercito(u2);
		centro.annadirEjercito(u1);
		
		System.out.println("---CADENA DE MANDO---");
		centro.ejecutarOrden();
		System.out.println("");
		
	}

}
