package com.yc.java002array;

public class Test {

	public static void main(String[] args) {
		// int a1, a2, a3, a4;// ....
		// int[] a = new int[10];// ���飺һ�ο��Զ���ͬ��Ķ������
		// // ���ڴ�������Ԫ�����������ڴ�ռ�
		// // ����Ԫ�����±���ʣ��±���㿪ʼ
		// //���鳤��ȷ����Ͳ��ܸ���
		// a[0] = 1;
		// a[1] = 3;
		// a[9] = 10;
		// a[10] = 22;
		// // /////////////////////
		// int a = 5, b;
		// b = a;
		// b = 8;
		// System.out.println(a + "," + b);

		// ///////////////////////
		// int[] a = new int[]{ 1, 2, 3 };
		// int[] a = { 1, 2, 3 };// ��������
		// int[] b = a;
		// b[1] = 55;
		// System.out.println(a[1]);
		// System.out.println(b[1]);
		// ///////////////////////

		int[] a = new int[10];// �����length����
		// System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = 50 + (int) (Math.random() * 30);// [0,1),,[50,80)
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

}
