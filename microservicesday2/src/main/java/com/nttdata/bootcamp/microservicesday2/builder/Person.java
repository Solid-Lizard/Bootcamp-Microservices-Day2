package com.nttdata.bootcamp.microservicesday2.builder;

import com.nttdata.bootcamp.microservicesday2.decorator.PersonInterface;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Person implements PersonInterface{
	private String name;
	private int age;
}
