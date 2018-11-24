package com.yc.java009Inheritence;

public class WorkTest1 {

	public static void main(String[] args) {
		// new X();
		new Z();
	}
}

class Y {
	public Y() {
		System.out.println(5);
	}

	public Y(int n) {
		System.out.println(6);
	}
}

class Z extends Y {

	public Z() {
		// super();// 显式调用
		this(2);
		//super(1);
		System.out.println(7);
		
	}
	public Z(int n) {
		// super();// 显式调用
		super();
		System.out.println(8);
	}


}

class X {
	int x;
	{
		System.out.println(2);
	}
	static {
		System.out.println(4);
	}

	public X() {
		this(3);
		x = 5;
		System.out.println(1);
	}

	public X(int a) {
		// this();
		System.out.println(3);
	}
}