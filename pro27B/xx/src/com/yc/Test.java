package com.yc;

import com.yc.framework.DbUtils;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(DbUtils.executeR("select* from t_user",
				UserModel.class));

	}

}
