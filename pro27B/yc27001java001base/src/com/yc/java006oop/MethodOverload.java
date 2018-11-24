package com.yc.java006oop;

public class MethodOverload {
	// ///////////////////////////////////////
	// 构造方法：是"和类同名"的方法，此方法无须指定返回值类型
	// 同一类中，同名的方法，叫“方法的重载”
	// 方法重载的条件：方法名相同“参数列表不同”（个数，类型，顺序）；仅返回值类型不同，不能够成重载
	// *****

	// int add(int a, int b) {
	// System.out.println(".");
	// return a + b;
	// }
	//
	long add(long a, int b) {
		System.out.println("..");
		return a + b;
	}

	long add(int a, long b) {
		System.out.println("...");
		return a + b;
	}

	int add(int a, int b, int c) {
		System.out.println("....");
		return a + b + c;
	}

	public static void main(String[] args) {
		int a = 5, b = 8;
		long rs = 0;
		// rs = new MethodOverload().add(a, b);
		MethodOverload mo = new MethodOverload();
		// rs = mo.add(a, b);
		System.out.println(rs);
	}

	// long add(int a, int b) {
	// return a + b;
	// }

}
