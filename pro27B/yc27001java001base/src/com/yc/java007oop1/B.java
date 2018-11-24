package com.yc.java007oop1;

public class B {
	protected int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 220) {
			this.age = 1;
		} else {
			this.age = age;
		}
	}

}
