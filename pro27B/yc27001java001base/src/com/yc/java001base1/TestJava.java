package com.yc.java001base1;//���������ͬ�����⣻���ࣻ

import java.util.Random;//�����
import java.util.Scanner;

public class TestJava {// �ࣺ

	public static void main(String[] args) {// ���������������������
		// alt+/,������ʾ
		// ctrl+shift+f//��ʽ������
		// ctrl+f11����
		// ctrl+s����
		// ctrl+/ע��
		// System.out.println("hello world!");
		// ///////////////////////////////
		// int a;// ����һ�����ͱ��� a;�ĸ��ֽڣ�1�ֽ�=8λ��1Byte=8bit;1B=8b;
		// int b;
		// int c;
		// a = 5;// ������ֵ
		// b = 8;
		// c = a + b;
		// System.out.println(c);
		// c = a - b;
		// System.out.println(c);
		// c = a * b;
		// System.out.println(c);
		// c = a / b;// �������߶����������������������
		// System.out.println(c);
		// c = a % b;
		// System.out.println(c);
		// // ////////////////////////////////////////
		// int a = 15, b = 8, c;
		// if (a > b) {// ������ѡ��ṹ
		// c = a;
		// } else {
		// c = b;
		// }
		// System.out.println(c);

		// // ////////////////////////////////////////
		// int a = 15, b = 8, c = 12, max;
		// if (a > b) {// ������ѡ��ṹ
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
		// // �ɼ�90������A��60~89:B,С��60��C
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
		// �ɼ�90������A��60~89:B,С��60��C
		// Random r = new Random();
		// int score = r.nextInt(101);
		// // System.out.println(score);
		// score = 90;
		// if (score >= 90) {
		// System.out.println("A");
		// }
		// if (score < 90 && score >= 60) {// ���ң�and
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
		// ��ʶ��������ĸ�����֡��»��ߡ�$��ɣ����������ֿ�ͷ�������ǹؼ���
		// int q3;
		// int $_3q;
		// // int int;
		// // ////////////////////////////////
		// int sum = 0;
		// for (int i = 1/* ���ʽһ ��ѭ��������ʼ�� */; i <= 100/* ���ʽ�����������ʽ */; i = i +
		// 1/*
		// * ���ʽ��
		// * ��
		// * �������ʽ
		// */) {// ѭ�����ظ�ִ��
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
		// for (; i <= 100;) {// ������������
		// sum += i;
		// ++i;
		// }
		// System.out.println(sum);
		// System.out.println(i);
		// ////////////////////////////////
		// int sum = 0;
		// int i = 1;
		// while (i <= 100) {// ������������
		// sum += i;
		// ++i;
		// }
		// System.out.println(sum);
		// ////////////////////////////////
		// int sum = 0;
		// int i = 1;
		// for (;;) {// ��ѭ��//�ޱ��ʽ����ʾ��������
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
		// ��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
		// ����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�

		// int a = 2, n = 5, sum = 0, item = 0;
		// for (int i = 0; i < n; i++) {
		// item = item * 10 + a;// 2,22,222,
		// sum += item;
		// }
		// System.out.println(sum);
		// // ///////////////////////////////////
		// // ��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
		// // �����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�
		// // (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
		// // (2)���n<>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ����
		// // (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
		// String rs = "";
		// int n = 90;
		// // System.out.println("������һ����������");
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
		// ��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
		// �����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�
		// (1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
		// (2)���n!=k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ����
		// (3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
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

	}// ������
}// ����
