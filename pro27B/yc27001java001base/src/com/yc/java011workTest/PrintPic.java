package com.yc.java011workTest;

public class PrintPic {
	private int n;

	public void setN(int n) {
		if (n > 35 || n < 1) {
			this.n = 15;
		} else {
			this.n = n;
		}
	}

	public PrintPic() {
		this(15);
	}

	public PrintPic(int n) {
		setN(n);
	}

	public void printPic() {
		printTop(this.n);
		printDown(this.n);
	}

	public void printPic(int n) {
		setN(n);
		printTop(this.n);
		printDown(this.n);
	}

	public void printDown(int n) {
		char c;
		for (int i = n - 1; i > 0; i--) {
			c = i < 10 ? (char) ('0' + i) : (char) ('A' + (i - 10));
			printLine(n - i, 2 * i - 1, c);
		}
	}

	public void printTop(int n) {
		char c;
		for (int i = 1; i <= n; i++) {
			c = i < 10 ? (char) ('0' + i) : (char) ('A' + (i - 10));
			printLine(n - i, 2 * i - 1, c);
		}
	}

	/**
	 * 打印行
	 * 
	 * @param sn
	 *            空格数量
	 * @param cn
	 *            字符数量
	 * @param c
	 *            字符
	 */
	public void printLine(int sn, int cn, char c) {
		printChar(sn, ' ');
		printChar(cn, c);
		System.out.println();

	}

	/**
	 * 打印字符的方法
	 * 
	 * @param n
	 *            个数
	 * @param c
	 *            字符
	 */
	public void printChar(int n, char c) {
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		}
	}

}
