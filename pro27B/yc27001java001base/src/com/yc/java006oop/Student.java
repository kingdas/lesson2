package com.yc.java006oop;

/*һ��Դ�ļ��п����ж���࣬��ֻ����һ�������ࣻ�Ҵ��ļ�������Ҫ�͹�����ͬ��*/
public class/* ������Ĺؼ��� */Student/* ���� */{// ����
	// ������ǲ�Ϊ�������κεġ����췽��������ôϵͳΪ��������һ���޲εĹ��췽��
	// �������Ϊ�������κεġ����췽��������ôϵͳ����Ϊ���������Ǹ��޲εĹ��췽����

	public Student(int a) {
		System.out.println("Student(int a)");
	}

	public Student() {
		// Student(43);
		this(9);
		// this()��Ĺ��췽��
		// �����뷽����ƽ����ϵ�����ܰ��������ڷ����п��Ե��÷���
		System.out.println("Student()");
		age = 10;
	}

	int age;// ���ԣ�ȫ��
	String name;

	void play() {// ����
		System.out.println("play");
		play(4);
	}

	void play(int age) {
		System.out.println("play");
		age = 33;// �βΣ��ֲ�
		this.age = 5;// this���������
		this.play();
		this.age=age;
	}

	void study() {

	}

	public static void main(String[] args) {
		// int a=5;
		// String t = "xx";
		// String tx = new String("xx");
		Student s;
		s = new Student(3);// new ʵ��������;ʵ�����ı��ʾ��ǵ��ù��췽��
		s.play();

	}

}

class Teacher {

}