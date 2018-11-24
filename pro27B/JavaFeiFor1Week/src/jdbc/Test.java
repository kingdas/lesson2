package jdbc;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		String sql = "select * from student where Sid<3";
		
		List<Student> us = DBUtils.executeR(sql, Student.class);
		System.out.println(us);

	}

}
