package com.yc.java020reflect;

import java.lang.reflect.Field;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// // String s=new String();
		// Object o = new Test().newInstance("com.yc.java020reflect.Student");
		// // System.out.println(o instanceof Student);
		// ////////////////////////////
	
		List<UserModel> ls = DbUtils.executeR("select * from t_user",
				UserModel.class);
		System.out.println(ls);

	}

	public Object newInstance(String className) {
		Object o = null;
		// o=new className();
		Class cls = null;
		try {
			cls = Class.forName(className);
			o = cls.newInstance();// ��������޲ι��췽��
			// o.name="xx";
			Field fname = cls.getDeclaredField("name");
			// cls.getField("");
			// fname="xx";
			fname.setAccessible(true);// ����˽������Ϊ����
			fname.set(o, "����");
			System.out.println(o);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return o;
	}

}
