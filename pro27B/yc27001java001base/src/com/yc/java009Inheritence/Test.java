package com.yc.java009Inheritence;

public class Test {

	public static void main(String[] args) {

		// Animal an = new Dog();// ����ת��
		// // ��������ÿ���ָ���������
		// an.eat();// ���õ��ǡ�ʵ�ʶ��󡱵ķ���
		//
		// Dog d = (Dog) an;// ����ת�ͣ�Ҫǿת�����ܻ�����쳣
		//
		// d.eat();
		//
		// Cat c;
		// if (an instanceof Cat) {// �ж϶����Ƿ������ʵ��
		// c = (Cat) an;// ClassCastException
		// }
		// /////////////////////////////
		// ʵ��������ʱ����ʵ��������Ķ���
		Dog d = new Dog();

	}

}

class Tx {

	int a;
	{// �����
		a = 5;
		System.out.println(11);
	}

	static {// ��̬�����
		System.out.println(22);
	}

	void t() {

	}

}
