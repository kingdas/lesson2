package com.yc.java008oop2;

public class StaticTest {

	// static*****
	// 类属性和类方法(静态成员)---对象属性和方法（非静态成员）

	public static void main(String[] args) {

		// A.b = 8;
		// A.tt();
		//
		// A a = new A();
		// a.a = 11;
		// a.t();
		// ////////////////////////
		A a1 = new A();
		a1.a = 1;
		a1.b = 2;
		A.b = 222;
		System.out.println("a1.a=" + a1.a + ",a1.b=" + a1.b);
		A a2 = new A();
		a2.a = 11;
		a2.b = 22;
		A.b = 22222;
		System.out.println("a2.a=" + a2.a + ",a2.b=" + a2.b);
		System.out.println("a1.a=" + a1.a + ",a1.b=" + a1.b);

		System.out.println();

	}

}

class A {
	// 静态成员属于类，是所有对象"共享的"；建议使用类名直接访问静态成员
	// 非静态成员属于对象
	// 在非静态成员中，可以使用非静态成员和静态成员
	// 在静态成员中，不可以使用非静态成员
	// 静态成员在类加载时就被创建了；
	// 非静态成员在类实例化时才被创建

	int a;
	static int b;// 静态属性

	void t() {
		// a = 7;
		// b = 9;
		// tt();
	}

	static void tt() {// 静态方法
		// a = 7;
		// b = 9;
		// t();
	}

}
