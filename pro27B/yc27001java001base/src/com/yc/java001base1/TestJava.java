package com.yc.java001base1;//包：解决类同名问题；分类；

import java.util.Random;//导入包
import java.util.Scanner;

public class TestJava {// 类：

	public static void main(String[] args) {// 方法：主方法；程序入口
		// alt+/,代码提示
		// ctrl+shift+f//格式化代码
		// ctrl+f11运行
		// ctrl+s保存
		// ctrl+/注释
		// System.out.println("hello world!");
		// ///////////////////////////////
		// int a;// 定义一个整型变量 a;四个字节；1字节=8位；1Byte=8bit;1B=8b;
		// int b;
		// int c;
		// a = 5;// 变量赋值
		// b = 8;
		// c = a + b;
		// System.out.println(c);
		// c = a - b;
		// System.out.println(c);
		// c = a * b;
		// System.out.println(c);
		// c = a / b;// 除号两边都是整数，结果还是整数；
		// System.out.println(c);
		// c = a % b;
		// System.out.println(c);
		// // ////////////////////////////////////////
		// int a = 15, b = 8, c;
		// if (a > b) {// 条件，选择结构
		// c = a;
		// } else {
		// c = b;
		// }
		// System.out.println(c);

		// // ////////////////////////////////////////
		// int a = 15, b = 8, c = 12, max;
		// if (a > b) {// 条件，选择结构
		// max = a;
		// } else {
		// max = b;
		// }
		// if (c > max) {
		// max = c;
		// }
		// System.out.println(max);
		// // ////////////////////////////////////////
		// int a = 1, b = 8, c = 3, max;
		// max = a;
		// if (b > max) {
		// max = b;
		// }
		// if (c > max) {
		// max = c;
		// }
		// System.out.println(max);
		// ////////////////////////////////////////
		// int a = 11, b = 8, c = 31, max;
		// if (a > b) {
		// max = a;
		// if (c > max) {
		// max = c;
		// }
		// } else {
		// max = b;
		// if (c > max) {
		// max = c;
		// }
		// }
		// System.out.println(max);
		// // //////////////////////////////////
		// // 成绩90以上是A，60~89:B,小于60：C
		// Random r = new Random();
		// int score = r.nextInt(101);
		// // System.out.println(score);
		// score = 100;
		// if (score >=90) {
		// System.out.println("A");
		// } else if (score >= 60) {
		// System.out.println("B");
		// } else {
		// System.out.println("C");
		// }

		// //////////////////////////////////
		// 成绩90以上是A，60~89:B,小于60：C
		// Random r = new Random();
		// int score = r.nextInt(101);
		// // System.out.println(score);
		// score = 90;
		// if (score >= 90) {
		// System.out.println("A");
		// }
		// if (score < 90 && score >= 60) {// 而且，and
		// System.out.println("B");
		// }
		// if (score < 60) {
		// System.out.println("C");
		// }
		// ////////////////////////////////
		// System.out.println(3 + 4 + "java" + 3 + 4);
		// String s = "ab" + 5;
		// // ////////////////////////////////
		// int a = 5, b = 8, c;
		// System.out.println("a=" + a + ",b=" + b);
		// c = a;
		// a = b;
		// b = c;
		// System.out.println("a=" + a + ",b=" + b);
		// // ////////////////////////////////
		// int a = 5, b = 8, c;
		// System.out.println("a=" + a + ",b=" + b);
		// a=a+b;
		// b=a-b;
		// a=a-b;
		// System.out.println("a=" + a + ",b=" + b);
		// ////////////////////////////////
		// int a = 15, b = 8, c;
		// System.out.println("a=" + a + ",b=" + b);
		// a = a ^ b;
		// b = a ^ b;
		// a = a ^ b;
		// System.out.println("a=" + a + ",b=" + b);
		// ////////////////////////////////
		// 标识符：由字母、数字、下划线、$组成；不能以数字开头，不能是关键字
		// int q3;
		// int $_3q;
		// // int int;
		// // ////////////////////////////////
		// int sum = 0;
		// for (int i = 1/* 表达式一 ，循环变量初始化 */; i <= 100/* 表达式二，条件表达式 */; i = i +
		// 1/*
		// * 表达式三
		// * ，
		// * 增量表达式
		// */) {// 循环：重复执行
		// sum = sum + i;
		// }
		// System.out.println(sum);
		// // ////////////////////////////////
		// int sum = 0;
		// for (int i = 1; i <= 100; i = i + 1) {
		// sum = sum + i;
		// }
		// System.out.println(sum);
		// ////////////////////////////////
		// int sum = 0;
		// int i = 1;
		// for (; i <= 100;) {// 变量的作用域
		// sum += i;
		// ++i;
		// }
		// System.out.println(sum);
		// System.out.println(i);
		// ////////////////////////////////
		// int sum = 0;
		// int i = 1;
		// while (i <= 100) {// 变量的作用域
		// sum += i;
		// ++i;
		// }
		// System.out.println(sum);
		// ////////////////////////////////
		// int sum = 0;
		// int i = 1;
		// for (;;) {// 死循环//无表达式二表示条件恒真
		// if (i > 100) {
		// break;
		// }
		// sum += i;
		// ++i;
		// }
		// System.out.println(sum);
		// // ////////////////////////////////
		// int sum = 0;
		// for (int i = 1; i <= 100; i += 2) {
		// sum += i;
		// }
		// System.out.println(sum);
		// 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
		// 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。

		// int a = 2, n = 5, sum = 0, item = 0;
		// for (int i = 0; i < n; i++) {
		// item = item * 10 + a;// 2,22,222,
		// sum += item;
		// }
		// System.out.println(sum);
		// // ///////////////////////////////////
		// // 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
		// // 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
		// // (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
		// // (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
		// // (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
		// String rs = "";
		// int n = 90;
		// // System.out.println("请输入一个正整数：");
		// Scanner s = new Scanner(System.in);
		// // n = s.nextInt();
		// // System.out.println(n);
		// int nt = n;
		// while (nt > 1) {
		// for (int i = 2; i <= nt; i++) {
		// if (nt % i == 0) {
		// rs = rs + i + "*";
		// nt /= i;
		// break;
		// }
		// }
		// }
		// System.out.println(n + "=" + rs.substring(0, rs.length() - 1));
		// ///////////////////////////////////
		// 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
		// 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
		// (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
		// (2)如果n!=k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
		// (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
		// String rs = "";
		// int n = 90;
		// System.out.print(n + "=");
		// int k = 2;
		// while (n != k) {
		// if (n % k == 0) {
		// System.out.print(k + "*");
		// n /= k;
		// } else {
		// k++;
		// }
		// }
		// System.out.print(n);
		// //////////////////////////////////
		//System.out.println(Math.pow(2, 31)-3);

		int a = -6;
		a = a >> 1;
		System.out.println(a);

	}// 方法体
}// 类体
