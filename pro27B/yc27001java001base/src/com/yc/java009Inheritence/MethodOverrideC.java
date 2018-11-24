package com.yc.java009Inheritence;

//方法的重写：
//发生在子类中
//方法的签名要和父类的方法完全相同
//访问修饰符只能扩大不能缩小
public class MethodOverrideC extends MethodOverride {

	// @Override
	// 注解
	void mo1() {

	}

	@Override
	void mo() {
		// TODO Auto-generated method stub
		super.mo();
	}

	@Override
	public long add(int a, long b) {
		return super.add(a, b);
	}
}
