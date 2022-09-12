package com.bank;

import java.util.Scanner;

public class BankATMProject {
	int pin, enterball;
	long avaiball = 35000;
	long remball;

	public void withdrawBallance() {

		for (int i = 1; i <= 3; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your pin");
			pin = in.nextInt();
			if (pin == 1617) {
				System.out.println(" Enter withdrawal amount");
				enterball = in.nextInt();
				if (avaiball > enterball) {

					remball = avaiball - enterball;
					remBall();
					break;
				} else
					System.out.println("Do not have enough Ballance");
				break;
			} else if (pin != 1617) {
				System.out.println("Enetr correct PIN");
			}
		}

	}

	public void remBall() {
		for (int i = 1; i <= 3; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println(" to check remaining balance");
			System.out.println("Enter your pin");
			pin = in.nextInt();
			if (pin == 1617) {
				System.out.println("available ballance is " +remball);
				break;
			} else {
				System.out.println(" Enter correct PIN");
			}
		}
	}

	public static void main(String[] args) {
		BankATMProject b = new BankATMProject();
		b.withdrawBallance();
		

	}
}