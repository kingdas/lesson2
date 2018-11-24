package com.yc.user;

import com.yc.framework.DbUtils;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		System.out.println(DbUtils.executeR("select * from t_user",
				UserModel.class));
		a();
		

	}
	
static	void a() throws Exception 
	{
		
	}

}
