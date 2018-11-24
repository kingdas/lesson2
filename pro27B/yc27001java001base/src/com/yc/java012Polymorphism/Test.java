package com.yc.java012Polymorphism;

public class Test {

	public static void main(String[] args) {
		// Animal an = new Dog();
		// an.eat();
		// // an = new Cat();
		// // an.eat();

		// ///////////////////
		// Dog d = new Dog();
		// d.eat();
		// d.sleep();
		// ////////////////////
		Animal an = new Dog();
		an.eat();
		// an.sleep();
		an = new Cat();
		an.eat();

	}

}
