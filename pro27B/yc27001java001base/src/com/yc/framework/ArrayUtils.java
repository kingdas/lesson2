package com.yc.framework;

import java.util.Random;

public class ArrayUtils {
	public  static void printArray(int[] a) {
		for (int t : a) {
			System.out.print(t + " ");
		}
		System.out.println();
	}

	public static void initArray(int[] a) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(100);
		}
	}
	
	public static void selectSort(int[] a)
	{
		int min, minIndex, tmp;
		for (int j = 0; j < a.length - 1; j++) {// Ñ¡ÔñÅÅÐò
			min = a[j];
			minIndex = j;
			for (int i = j; i < a.length; i++) {
				if (a[i] < min) {
					min = a[i];
					minIndex = i;
				}
			}
			tmp = a[j];
			a[j] = a[minIndex];
			a[minIndex] = tmp;
		}

	}
}
