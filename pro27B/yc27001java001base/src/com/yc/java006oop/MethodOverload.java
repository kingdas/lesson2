package com.yc.java006oop;

public class MethodOverload {
	// ///////////////////////////////////////
	// ���췽������"����ͬ��"�ķ������˷�������ָ������ֵ����
	// ͬһ���У�ͬ���ķ������С����������ء�
	// �������ص���������������ͬ�������б�ͬ�������������ͣ�˳�򣩣�������ֵ���Ͳ�ͬ�����ܹ�������
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
