package com.yc.java003function;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// 方法：目的，代码重用；
		// 方法的定义：
		// 方的签名（返回值类型+方法名+形式参数列表）+方法体｛｝
		// 方法的使用：方法名+实际参数
		// int n = -9;
		// Test t = new Test();
		// int rs = t.abs(n);// 实参
		// System.out.println(rs);
		// ////////////////////
		// int n = -9;
		// int rs = abs(n);
		// System.out.println(rs);
		// ////////////////////
		// byte b;
		// short s;
		// int i;
		// long l;
		//
		// char c;
		//
		// float f;
		// double d;
		//
		// boolean bln;
		// ///////////////////////////////////
		// int a = 5, b = 8;
		// System.out.println("a=" + a + ",b=" + b);
		// change(a, b);
		// System.out.println("a=" + a + ",b=" + b);
		// //////////////////////
		int[] a = new int[10];
		printArray(a);
		initArray(a);
		printArray(a);

	}

	static void printArray(int[] a) {
		for (int t : a) {// 增强for循环，foreach
			System.out.print(t + " ");
		}
		System.out.println();
	}

	static void initArray(int[] a) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}
	}

	// 形参为引用类型时，形参的改变会影响实参
	// 形参为值类型时，形参的改变不会影响实参;
	// 值类型：8种基本数据类型都为值类型

	static void change(int a, int b) {
		int t;
		t = a;
		a = b;
		b = t;
	}

	/**
	 * 求n的绝对值
	 * 
	 * @param n
	 * @return n的绝对值
	 */
	static int abs(int n) {// 形参
		if (n < 0) {
			return -1 * n;// 遇到return方法调用结束
		}
		return n;// 返回值
	}
}
