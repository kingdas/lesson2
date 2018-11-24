package com.yc.java012Polymorphism;

public class Dog extends Animal {

	@Override
	void eat() {
		System.out.println("Dog.eat");
	}

	void sleep() {
		System.out.println("dog.sleep");
	}

}
