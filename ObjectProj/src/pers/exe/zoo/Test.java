package pers.exe.zoo;

import java.util.Scanner;

public class Test {
	public static void menu() {
		System.out.println("******欢迎来到太阳马戏团********");
		System.out.println("******请选择表演者*******");
		System.out.println("******   1、棕熊   *******");
		System.out.println("******   2、狮子   *******");
		System.out.println("******   3、猴子   *******");
		System.out.println("******   4、鹦鹉   *******");
		System.out.println("******   5、小丑   *******");
	}

	public static void hint() {
		System.out.println("****** 是否继续观看 （1/0）********");
	}

	public static void exit() {
		System.out.println("****** 欢迎下次光临  ********");
	}
	public static void main(String[] args) {
		Bear bear = new Bear("lili", 5);
		Lion lion = new Lion("onon", 10, "red", "man");
		Monkey monkey = new Monkey("mm", 11, "A");
		Parrto parrto = new Parrto("pp", 5, "B");
		Clown clown = new Clown("clown", 22);
		int i,j;
		Scanner sc = new Scanner(System.in);
		//使用scanner进行in 赋值
		boolean isMenu = true;
		while (isMenu) {
			menu();
			i = sc.nextInt();
			switch (i) {
			case 0:
				isMenu = false;
				exit();
				break;
			case 1:
				System.out.println(bear.act());
				hint();
				j = sc.nextInt();
				if(j == 1) {
					break;
				}else {
					isMenu = false;
					exit();
					break;
				}					
			case 2:
				System.out.println(lion.act());
				hint();
				j = sc.nextInt();
				if(j == 1) {
					break;
				}else {
					isMenu = false;
					exit();
					break;
				}	
			case 3:
				System.out.println(monkey.act());
				hint();
				j = sc.nextInt();
				if(j == 1) {
					break;
				}else {
					isMenu = false;
					exit();
					break;
				}	
			case 4:
				System.out.println(parrto.act());
				hint();
				j = sc.nextInt();
				if(j == 1) {
					break;
				}else {
					isMenu = false;
					exit();
					break;
				}	
			case 5:
				System.out.println(clown.act());
				hint();
				j = sc.nextInt();
				if(j == 1) {
					break;
				}else {
					isMenu = false;
					exit();
					break;
				}	
			default:
				System.out.println("请重新输入！");
				hint();
				j = sc.nextInt();
				if(j == 1) {
					break;
				}else {
					isMenu = false;
					exit();
					break;
				}	
			}
		}
	}
}
