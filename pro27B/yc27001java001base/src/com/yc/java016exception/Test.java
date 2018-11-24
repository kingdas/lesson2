package com.yc.java016exception;

public class Test {
	
	int a;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (a != other.a)
			return false;
		return true;
	}

	public static void main(String[] args) // throws Exception

	{
		
		
		// int a = 0;
		// int[] b = new int[2];
		//
		// try {
		// // a = 1 / a;// 抛出“ArithmeticException”异常对象
		// a = b[2] / b[0];
		// System.out.println(".");
		// } catch (ArithmeticException e) {
		// // System.out.println(e.getMessage());
		// e.printStackTrace();
		// System.out.println("..");
		// } catch (ArrayIndexOutOfBoundsException e) {
		// e.printStackTrace();// ArrayIndexOutOfBoundsException
		// System.out.println("...");
		// } catch (Exception e) {
		// // System.out.println(e instanceof ArithmeticException);
		// // e.printStackTrace();
		// // System.out.println(e.getMessage());
		// e.printStackTrace();// ArrayIndexOutOfBoundsException
		// System.out.println("....");
		// }
		//
		// System.out.println("**");
		// // /////////////////////////////////////
		// int a = 0;
		// try {
		// a = 1 / a;
		// } catch (Exception e) {
		// e.printStackTrace();
		// // return;//相当于方法调用结束，finally会执行
		// System.exit(0);//退出程序 ，finally不会执行
		// }
		//
		// finally {
		// System.out.println("finally");
		// }
		//
		// System.out.println("**");
		// /////////////////////////////////////
		// int a = 0;
		// try {
		// a = 1 / a;
		// } finally {
		// System.out.println("finally");
		// }
		// System.out.println("**");

		// //////////////////////
		// int a;
		// a = xx();
		// System.out.println(a);
		// // // /////////////////////////////////////
		// int a = 0;
		// try {
		// // a = 1 / a;//java虚拟机
		// // throw new Exception("xxx....");
		// // throw new Throwable("xxx....");
		// throw new MyException("...");
		// } catch (Throwable e) {
		// e.printStackTrace();
		// }
		// // /////////////////////////////////////
		// try {
		// x();
		// } catch (Exception e) {
		// e.printStackTrace();
		// }// 当前try-cacth
		// // 向上继续抛
		// // /////////////////////////////////////
		xxx();

	}

	static void xxx() throws RuntimeException //运行时异常，没要求强制处理异常
	{

	}

	static void x() throws Exception // 检查异常
	{

	}

	static int xx() {
		try {
			int a = 0;
			return 1;
			// a = 1 / a;

		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
		// return 4;
	}

}

class MyException extends Exception {
	public MyException() {
		// TODO Auto-generated constructor stub
	}

	public MyException(String msg) {
		super(msg);
	}
}
