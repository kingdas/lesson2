package com.yc.java013abstractClass;

public abstract class  Animal {
	abstract void eat();

	// {
	//
	// }

	void sleep() {

	}

	public static void main(String[] args) {
		// new Animal();
		Animal an = new Dog();

	}
}

class Dog extends Animal {

	@Override
	void eat() {
		
	}

}