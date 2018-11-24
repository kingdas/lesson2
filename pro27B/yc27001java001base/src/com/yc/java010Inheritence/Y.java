package com.yc.java010Inheritence;

public class Y extends X {

	@Override
	public void setB(int b) {
		super.setB(b + 1);
	}
//	@Override
	public void setB() {
		super.setB( 1);
	}

	void t() {
		a = 5;
		setB(3);
		System.out.println(a);
	}

	public Y() {
		super(3);
	}

	public static void main(String[] args) {
		new Y().t();
	}

}
