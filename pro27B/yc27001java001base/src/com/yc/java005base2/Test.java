package com.yc.java005base2;

import com.yc.framework.ArrayUtils;

public class Test {

	public static void main(String[] args) {
		// // 数据类型
		// // java中有八种基本数据类型
		// // 整数类型
		// byte b;// 在内存在占一个字节的内存空间
		// short s;// 占两个字节
		// int i;// 四
		// long l;// 八
		//
		// b = 127;
		// // b = b + 1;// 错的，结果是int类型，赋值给byte。出错；
		// // b = (byte) (b + 1);// 强制类型转换
		// b += 1;// 编译器做了优化
		// System.out.println(b);
		// // 在计算机中，所有的数据都是以补码的形式存在的
		// // 已知一个“负数的补码”求这个数：
		// // 1.各位取反；2.转成十进制数；3.加上负号，减一；
		// // 已知一个负数，求这个数的补码：
		// // 去掉符号位， 取反加一
		// // -7;//7:0000 0111-->1111 1000-->1111 1001
		//
		// System.out.println(Integer.toBinaryString(-7));
		// ////////////////////////
		// byte b1 = 5, b2 = 8;
		// int b3;
		// b3 = b1 + b2;
		// 运算的结果类型最小为int
		// byte b = 12;
		// int i;
		// i = b;
		// b = i;
		// ////////////////
		// int i = 128;
		// byte b;
		// b = (byte) i;
		// System.out.println(b);
		// 强制类型转换：本质是高位截断
		// ////////////////
		// char c;// 字符类型：'';占两个字节
		// c = '中';
		// int t;
		// t = c;
		// System.out.println(c);
		// System.out.println(t);
		// ///////////////////////////////

		// float f;// 4
		// double d;// 8
		// f = 3.14F;
		// d = 5.2;
		//
		// System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		// System.out.println(Double.MIN_VALUE + "~" + Double.MAX_VALUE);
		//
		// boolean bln;
		// bln = true;
		// bln = false;

		// ////////////////////////////////
		// 运算符：
		// 算术、关系、逻辑、位、其它运算符
		// 算术：+-*/%
		// 分组
		// int m = 86;
		// int n = 13;
		// int g;
		// if (m % n == 0) {
		// g = m / n;
		// } else {
		// g = m / n + 1;
		// }
		// System.out.println(g);
		// ///////////////////////
		// int m = 86;
		// int n = 13;
		// int g;
		// g = (m + n - 1) / n;
		// System.out.println(g);
		// ///////////////////////////////
		// 关系:>,<,>=,<=,!=,==
		// 关系运算符运算结果是布尔类型F
		// int a = 5, b = 8;
		// boolean bln;
		// bln = a != b;
		// System.out.println(bln);
		// if (true) {
		// System.out.println(11);
		// }
		// 逻辑:与&&and、或||or、非!(单目运算符)
		// boolean b1 = true, b2 = false, t;
		// t = b1 && b2;
		// System.out.println(t);
		// System.out.println(!false);
		// ////////////////////////////
		// int a = 5, b = 8, c;
		// boolean bln;
		// bln = ((c = a) > b) && ((c = b) > a);// 短路
		// System.out.println(bln);
		// System.out.println(c);
		// //////////////////////////
		// int a = 5, b = 8, c;
		// boolean bln;
		// bln = ((c = a) > b) & ((c = b) > a);// &进行逻辑运算时不短路
		// System.out.println(bln);
		// System.out.println(c);
		// 位：&，|，~，^,>>,<<,>>>
		// int a = 9, b = 17, c;
		// 除二取余反序：
		// c = a & b;
		// System.out.println(c);
		// c = a | b;
		// System.out.println(c);
		// c = a ^ b;
		// System.out.println(c);
		// c = ~a;
		// System.out.println(c);
		// System.out.println(~99);
		// System.out.println(021&0xF);
		// // ///////////////
		// int a = 5;
		// a <<= 3;
		// System.out.println(a);
		// a >>= 4;
		// System.out.println(a);
		// ///////////////
		// int a = -15;
		// a >>>= 2;
		// System.out.println(a);
		// ///////////////////////
		// 求一个整数在内存中表现时，1的个数；
		// int a = -21;
		// String s = Integer.toBinaryString(a);
		// System.out.println(s);
		// ////////////////////////////////
		// int n = -15;
		// int c = 0;
		// while (n != 0) {
		// c += n & 1;
		// n >>>= 1;
		// }
		// System.out.println(c);
		// ////////////////////////////////
		// int a = 3, b = 4, c = 5;// [0,5]
		// int n;
		// n = c << 8 | b << 4 | a;
		// System.out.println(n);
		// a = n & 0xF;
		// System.out.println(a);
		// b = n >> 4 & 0xF;
		// System.out.println(b);
		// c = n >> 8;
		// System.out.println(c);
		// 其它运算符:?:（三目运算符）,++,--,(),.,=
		// g = m % n == 0 ? m / n : m / n + 1;
		// System.out.println(g);
		// /////////////////////////
		// int n=3;
		// int m;
		// m=++n;
		// System.out.println(m+","+n);
		// //////////////////////////
		// int i=3;
		// System.out.println(++i+i+++i++);
		// ///////////////////////////////////
		// 程序结构
		// //////////////////////////
		// int a = 31, b = 11, c = 12, max;
		// // max = a > b ? ((a > c) ? a : c) : ((b > c) ? b : c);
		// max = a > b ? a : b;
		// max = c > max ? c : max;
		// System.out.println(max);
		// ///////////////////
		// int k = 21;
		// switch (k) {// 当JDK1.5以前key只能是int，当JDK1.5以后还可以是枚举，当JDK1.7时可以是String
		// case 2:
		// System.out.println(22);
		// // break;// 跳出switch
		// case 1:
		// System.out.println(11);
		// break;
		// case 22:
		// System.out.println(22222);
		// break;
		//
		// default:
		// System.out.println("default");
		// //break;
		// }
		// ///////////////////
		// 利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，
		// 60-89分之间的用B表示，60分以下的用C表示。
		// int score = 60;
		// switch (score / 10) {
		// case 10:
		// case 9:
		// System.out.println("A");
		// break;
		// case 8:
		// case 7:
		// case 6:
		// System.out.println("B");
		// break;
		// default:
		// System.out.println("C");
		// break;
		// }
		// // ///////////////////
		// int n = 5;
		// int c = 0;
		// while (n < 5) {
		// c++;
		// n++;
		// }
		// System.out.println(c);
		// ///////////////////
		// int n = 5;
		// int c = 0;
		// do {
		// c++;
		// n++;
		// } while (n < 5);
		// System.out.println(c);
		// while&do-while:do-while的循环体至少被执行一次；如果首次条件成立他俩没区别
		// ***************************************
		// 数组
		// ***************************************
		// int[] a;// 定义数组变量时[]中不可以写数字
		// int aa[];
		// boolean[] b;
		// /////////////
		// int[] a = new int[10];
		// int[] b = { 1, 2, 3 };
		// int[] c = new int[] { 2, 3 };
		// System.out.println(b[1]);
		// // System.out.println(c[2]);
		// System.out.println(a[7]);
		// int x;
		// System.out.println(x);
		// ///////////////////
		// int[] a = { 1, 2 };
		// int[] b = { 7, 8 };
		// int[][] c = { a, b };// 二维数组
		// int[][] d = { { 3, 4, 5 },
		// { 6, 7, 8, 9 } };// 交错数组
		// // System.out.println(d.length);
		// // System.out.println(d[0].length);
		// for (int i = 0; i < d.length; i++) {
		// for (int j = 0; j < d[i].length; j++) {
		// System.out.print(d[i][j] + " ");
		// }
		// System.out.println();
		// }
		// ///////////////////
		// int[][] a=new int[2][];
		// a[0]=new int[4];
		// a[1]=new int[5];
		// // ///////////////////
		// int[] a = new int[10];
		// ArrayUtils.initArray(a);
		// ArrayUtils.printArray(a);
		//
		// int min, minIndex;
		//
		// min = a[0];
		// minIndex = 0;
		// for (int i = 0; i < a.length; i++) {
		// if (a[i] < min) {
		// min = a[i];
		// minIndex = i;
		// }
		// }
		// System.out.println(min + "," + minIndex);

		// ///////////////////
		// int[] a = new int[10];
		// ArrayUtils.initArray(a);
		// ArrayUtils.printArray(a);
		//
		// int min, minIndex, tmp;
		// {
		// min = a[0];
		// minIndex = 0;
		// for (int i = 0; i < a.length; i++) {
		// if (a[i] < min) {
		// min = a[i];
		// minIndex = i;
		// }
		// }
		// tmp = a[0];
		// a[0] = a[minIndex];
		// a[minIndex] = tmp;
		// }
		//
		// ArrayUtils.printArray(a);

		// // ///////////////////
		// int[] a = new int[10];
		// ArrayUtils.initArray(a);
		// ArrayUtils.printArray(a);
		//
		// int min, minIndex, tmp;
		// for (int j = 0; j < a.length - 1; j++) {// 选择排序
		// min = a[j];
		// minIndex = j;
		// for (int i = j; i < a.length; i++) {
		// if (a[i] < min) {
		// min = a[i];
		// minIndex = i;
		// }
		// }
		// tmp = a[j];
		// a[j] = a[minIndex];
		// a[minIndex] = tmp;
		// }
		//
		// ArrayUtils.printArray(a);
		// // ///////////////////
		int[] a = new int[10];
		ArrayUtils.initArray(a);
		ArrayUtils.printArray(a);
		ArrayUtils.selectSort(a);
		ArrayUtils.printArray(a);
		// ////////////////////
		// int a = 3;
		// char[] c = { 'a', 'm' };
		// String s = "abc";
		// xxx(a, c, s);
		// System.out.println(a);
		// System.out.println(c);
		// System.out.println(s);
		// ////////////
		// int as[][] = new int[0][];
		// System.out.println(as.length);

	}

	static void xxx(int a, char[] c, String s) {
		a += 2;
		c[0] = 'x';
		s += "..";
	}

}
