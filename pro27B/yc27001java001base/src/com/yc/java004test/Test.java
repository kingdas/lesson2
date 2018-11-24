package com.yc.java004test;

public class Test {

	public static void main(String[] args) {
		// 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
		// for (int i = -99; i < 10000; i++) {
		// if (isXxx(i + 100) && isXxx(i + 268)) {
		// System.out.println(i);
		// }
		// }
		//
		// System.out.println(Math.sqrt(1));
		// /////////////////////////////
		for (int i = 1; i <= 90; i++) {
			for (int j = i; j <= 90; j++) {
				if (j * j - 268 == i * i - 100) {
					System.out.println(j * j - 268);
				}
			}
		}
		System.out.println("---");

	}

	/**
	 * 求n是否是完全平方数
	 * 
	 * @param n
	 * @return
	 */
	static boolean isXxx(int n) {
		for (int i = 1; i <= n; i++) {
			if (i * i == n) {
				return true;
			}
		}
		return false;
	}

}
