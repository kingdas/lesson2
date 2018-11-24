package com.yc.java009Inheritence;

public class Dog extends Animal {

	public Dog() {
		super(5);
		System.out.println("Dog()");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat()");
	}

}
