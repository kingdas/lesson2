package com.yc.java006oop;

/*一个源文件中可以有多个类，但只能有一个公共类；且此文件的名字要和公共类同名*/
public class/* 定义类的关键字 */Student/* 类名 */{// 类体
	// 如果我们不为类增加任何的“构造方法”，那么系统为我们增加一个无参的构造方法
	// 如果我们为类增加任何的“构造方法”，那么系统将不为我们增加那个无参的构造方法了

	public Student(int a) {
		System.out.println("Student(int a)");
	}

	public Student() {
		// Student(43);
		this(9);
		// this()类的构造方法
		// 方法与方法是平级关系，不能包含；但在方法中可以调用方法
		System.out.println("Student()");
		age = 10;
	}

	int age;// 属性，全局
	String name;

	void play() {// 方法
		System.out.println("play");
		play(4);
	}

	void play(int age) {
		System.out.println("play");
		age = 33;// 形参，局部
		this.age = 5;// this代表对象本身
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
		s = new Student(3);// new 实例化对象;实例化的本质就是调用构造方法
		s.play();

	}

}

class Teacher {

}