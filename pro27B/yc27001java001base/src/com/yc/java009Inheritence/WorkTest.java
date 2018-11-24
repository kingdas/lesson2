package com.yc.java009Inheritence;

public class WorkTest {
	public static void main(String[] args) {
		// new Wtb();
		// System.out.println();
		new Wtb();
	}
}

class Wta {
	{
		System.out.print(1);
	}
	static {
		System.out.print(2);
	}

	public Wta() {
		System.out.print(3);
	}

	public Wta(int x) {
		this();
		System.out.print(4);
	}
}

class Wtb extends Wta {
	{
		System.out.print(5);
	}
	static {
		System.out.print(6);
	}

	public Wtb() {
		this(3);
		System.out.print(7);
	}

	public Wtb(int x) {
		super(x);
		System.out.print(8);
	}
}
