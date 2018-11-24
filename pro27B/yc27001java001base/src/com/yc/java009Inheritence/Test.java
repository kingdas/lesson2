package com.yc.java009Inheritence;

public class Test {

	public static void main(String[] args) {

		// Animal an = new Dog();// 向上转型
		// // 父类的引用可以指向子类对象
		// an.eat();// 调用的是“实际对象”的方法
		//
		// Dog d = (Dog) an;// 向下转型：要强转，可能会产生异常
		//
		// d.eat();
		//
		// Cat c;
		// if (an instanceof Cat) {// 判断对象是否是类的实例
		// c = (Cat) an;// ClassCastException
		// }
		// /////////////////////////////
		// 实例化子类时，先实例化父类的对象
		Dog d = new Dog();

	}

}

class Tx {

	int a;
	{// 代码块
		a = 5;
		System.out.println(11);
	}

	static {// 静态代码块
		System.out.println(22);
	}

	void t() {

	}

}
