package com.imooc.datamanage;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 从键盘接受整型数据存放到数组中，并对数组中的数据进行管理
 * 
 * @author ZHR
 *
 */
public class DataManage {
	/**
	 * 从键盘接受数据，
	 * 
	 * @return 接受数据的数组
	 */
	public int[] insertData() {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		// 少接受一个数据
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println("请输入第" + (i + 1) + "个数据");
			try {
				a[i] = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字!");
				sc.next();
				i--;
			}

		}
		return a;
	}

	/**
	 * 显示数组中的内容
	 * 
	 * @param a      数组
	 * @param length 个数
	 */
	public void showData(int[] a, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 从键盘接受一个数字，插入数字指定处
	 * 
	 * @param a 数组
	 * @param n 要插入的数字
	 * @param k 要插入的位置，从0开始
	 */
	public void insertAtArray(int[] a, int n, int k) {
		for (int i = a.length - 1; i > k; i--) {
			a[i] = a[i - 1];
		}
		a[k] = n;
	}

	/**
	 * 输出数组中能被3整除
	 * 
	 * @param a 数组
	 */
	public void divThree(int[] a) {
		String str = "";
		int count = 0;
		for (int n : a) {
			if (n % 3 == 0) {
				str = str + n + " ";
				count++;
			}
		}
		if (count == 0) {
			System.out.println("数组中没有能被3整除");
		} else {
			System.out.println("数组中能被3整除为：" + str);
		}
	}

	/**
	 * 提示信息
	 */
	public void notice() {
		System.out.println("**************************************");
		System.out.println("          1--插入数据");
		System.out.println("          2--显示所有数据");
		System.out.println("          3--在指定位置处插入数据");
		System.out.println("          4--查询能被3整除的数据");
		System.out.println("          0--退出");
		System.out.println("**************************************");
	}

	/**
	 * 主方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		DataManage dm = new DataManage();
		Scanner sc = new Scanner(System.in);
		// 业务处理--主方法1
		int n = 0, k = 0;
		int[] a = null;
		int input = 0;
		while (true) {
			dm.notice();
			System.out.println("请输入对应的数字进行操作");
			try {
				input = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("输入的数据格式有误，不能有非数字！");
				sc.next();
				continue;
			}

			if (input == 0) {
				System.out.println("退出程序!");
				break;
			}
			switch (input) {
			case 1:
				// 插入数据
				a = dm.insertData();
				// 显示数据
				System.out.println("数组元素为：");
				dm.showData(a, a.length - 1);
				break;
			case 2:
				if (a != null) {
					System.out.println("数组元素为：");
					if (a[a.length - 1] == 0) {
						dm.showData(a, a.length - 1);
					} else {
						dm.showData(a, a.length);
					}
				} else {
					System.out.println("还未在数组中插入数据，请重新选择操作");
				}

				break;
			case 3:

				if (a != null) {
					System.out.println("请输入要插入的数据：");

					try {
						n = sc.nextInt();
						System.out.println("请输入要插入的数据的位置：");
						k = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("输入的数据格式有误，不能有非数字！");
						sc.next();
						break;
					}
					dm.insertAtArray(a, n, k);
					dm.showData(a, a.length);
				} else {
					System.out.println("还未在数组中插入数据，请重新选择操作");
				}
				System.out.println("在指定位置处插入数据");
				break;
			case 4:
				if (a != null) {
					dm.divThree(a);
				} else {
					System.out.println("还未在数组中插入数据，请重新选择操作");
				}

				break;
			default:
				System.out.println("方法为找到！");
				break;
			}
		}
	}
}
