package com.yc.java018menuSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Administrator
 * 
 */
public class OrderDishes {
	private List<Food> orderList = new ArrayList<Food>();
	private Menu menu = new Menu();
	public void addOrderList() {
		System.out.println("菜单如下，请选择");
		System.out.println("编号\t菜名                 \t价格");
		System.out.println(menu);
		System.out.println("请点菜，输入菜的编号，0代表结束");
		Scanner s = new Scanner(System.in);
		int n;
		do {
			n = s.nextInt();
			for (Food f : menu.getMenuList()) {
				if (f.getId() == n) {
					orderList.add(f);
				}
			}
		} while (n != 0);
		// int n=1;
		// Food ft=null;
		// List<Food> fs=menu.getMenuList();
		// for(int i=0;i<fs.size();i++)
		// {
		// ft=fs.get(i);
		// if(ft.getId()==n)
		// {
		// orderList.add(ft);
		// }
		// }
	}
	public void calcFee() {
		int sum = 0;
		for (Food f : orderList) {
			sum += f.getPrice();
		}
		System.out.println("结账，你总共消费了" + sum + "元");
	}

}
