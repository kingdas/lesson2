package com.yc.java008oop2;

public class StaticTest {

	// static*****
	// �����Ժ��෽��(��̬��Ա)---�������Ժͷ������Ǿ�̬��Ա��

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
	// ��̬��Ա�����࣬�����ж���"�����"������ʹ������ֱ�ӷ��ʾ�̬��Ա
	// �Ǿ�̬��Ա���ڶ���
	// �ڷǾ�̬��Ա�У�����ʹ�÷Ǿ�̬��Ա�;�̬��Ա
	// �ھ�̬��Ա�У�������ʹ�÷Ǿ�̬��Ա
	// ��̬��Ա�������ʱ�ͱ������ˣ�
	// �Ǿ�̬��Ա����ʵ����ʱ�ű�����

	int a;
	static int b;// ��̬����

	void t() {
		// a = 7;
		// b = 9;
		// tt();
	}

	static void tt() {// ��̬����
		// a = 7;
		// b = 9;
		// t();
	}

}
