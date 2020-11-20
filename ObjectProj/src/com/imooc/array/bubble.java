package com.imooc.array;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bubble sort
		int temp;
		int[] n = { 1, 7, 6, 12, 15, 34, 654, 34, 76 };
		for (int i = 0; i < (n.length-1); i++) {
			for (int j = 0; j < (n.length -i- 1); j++) {
				if (n[j] > n[j + 1]) {
					temp = n[j];
					n[j] = n[j + 1];
					n[j + 1] = temp;
				}
			}
		}
		for (int z : n) {
			System.out.print(z + "  ");
		}

	}

}
