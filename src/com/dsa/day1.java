package com.dsa;

import java.util.Scanner;

public class day1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				
			}else if(i % 2 != 0) {
					System.err.println(i);
				}
		}
		sc.close();
	}
}
