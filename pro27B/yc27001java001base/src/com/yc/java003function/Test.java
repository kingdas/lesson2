package com.yc.java003function;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// ������Ŀ�ģ��������ã�
		// �����Ķ��壺
		// ����ǩ��������ֵ����+������+��ʽ�����б�+���������
		// ������ʹ�ã�������+ʵ�ʲ���
		// int n = -9;
		// Test t = new Test();
		// int rs = t.abs(n);// ʵ��
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
		for (int t : a) {// ��ǿforѭ����foreach
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

	// �β�Ϊ��������ʱ���βεĸı��Ӱ��ʵ��
	// �β�Ϊֵ����ʱ���βεĸı䲻��Ӱ��ʵ��;
	// ֵ���ͣ�8�ֻ����������Ͷ�Ϊֵ����

	static void change(int a, int b) {
		int t;
		t = a;
		a = b;
		b = t;
	}

	/**
	 * ��n�ľ���ֵ
	 * 
	 * @param n
	 * @return n�ľ���ֵ
	 */
	static int abs(int n) {// �β�
		if (n < 0) {
			return -1 * n;// ����return�������ý���
		}
		return n;// ����ֵ
	}
}
