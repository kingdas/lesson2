package com.yc.java007oop1;

public class C {// 外部类

	void t() {
		new D().a = 5;// 外部类可以访问内部类的私有成员
	}

	class D {// 内部类
		private int a;

	}

}
