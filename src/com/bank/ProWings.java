package com.bank;

import java.util.Scanner;

public class ProWings {
	int rightpaid, T_remFee, totalfee;
	int remFee = 30000;

	Scanner sc = new Scanner(System.in);

	void m1() {
		System.out.println("inter roll number");
		int number = sc.nextInt();
		switch (number) {

		case 1:
			System.out.println("Vaibhav Khot");
//			 totalfee=50000;

			System.out.println("enter amount which you pay now");
			rightpaid = sc.nextInt();
			T_remFee = remFee - rightpaid;
			System.out.println("still remaining fee of Vaibhav is " + T_remFee);
			break;

		case 2:
			System.out.println("Shree");
//			 totalfee=50000;

			System.out.println("enter amount which you pay now");
			rightpaid = sc.nextInt();
			T_remFee = remFee - rightpaid;
			System.out.println("still remaining fee of Shree is " + T_remFee);
			break;
		}

	}

	public static void main(String[] args) {
		System.out.println("main");
		ProWings p = new ProWings();
		p.m1();
	}
}
