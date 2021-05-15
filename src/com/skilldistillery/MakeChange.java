package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		double itemCost, amountTendered, totalChange;
		double twenties, tens, fives, ones, quarters, dimes, nickels;

		System.out.println("What is the price of your item?");
		itemCost = kb.nextDouble();

		System.out.println("How much money did you tender?");
		amountTendered = kb.nextDouble();

		if (amountTendered < itemCost) {
			System.out.println("You did not tender enough to purchase this item! Please give me more money. Aghhhh!");

		} else if (amountTendered == itemCost) {
			System.out.println("Thank you. No change is needed. Come again soon!");

		}

		else {

			totalChange = amountTendered - itemCost;

			System.out.print("Total change needed: $");
			System.out.printf("%.2f \n", totalChange);
			System.out.print("Change denominations: ");

			while (totalChange > 0) {

				if (totalChange >= 20.00) {
					// give twenties
					twenties = (int) (totalChange / 20.00);
					totalChange = totalChange - (twenties * 20.00);

					if (twenties > 1) {
						System.out.print((int) twenties + " twenty dollar bills, ");

					} else {
						System.out.print((int) twenties + " twenty dollar bill, ");

					}

				}

				else if (totalChange >= 10.00) {
					// give tens
					tens = (int) (totalChange / 10.00);
					totalChange = totalChange - (tens * 10.00);

					if (tens > 1) {
						System.out.print((int) tens + " ten dollar bills, ");

					} else {
						System.out.print((int) tens + " ten dollar bill, ");

					}

				}

				else if (totalChange >= 5.00) {
					// give fives
					fives = (int) (totalChange / 5.00);
					totalChange = totalChange - (fives * 5.00);

					if (fives > 1) {
						System.out.print((int) fives + " five dollar bills, ");

					} else {
						System.out.print((int) fives + " five dollar bill, ");

					}

				} else if (totalChange >= 1.00) {
					// give ones
					ones = (int) (totalChange / 1.00);
					totalChange = totalChange - (ones * 1.00);

					if (ones > 1) {
						System.out.print((int) ones + " one dollar bills, ");

					} else {
						System.out.print((int) ones + " one dollar bill, ");

					}

				} else if (totalChange >= 0.25) {
					// give quarters
					quarters = (int) (totalChange / 0.25);
					totalChange = totalChange - (quarters * 0.25);

					if (quarters > 1) {
						System.out.print((int) quarters + " quarters, ");

					} else {
						System.out.print((int) quarters + " quarter, ");

					}

				} else if (totalChange >= 0.10) {
					// give dimes
					dimes = (int) (totalChange / 0.10);
					totalChange = totalChange - (dimes * 0.10);

					if (dimes > 1) {
						System.out.print((int) dimes + " dimes, ");

					} else {
						System.out.print((int) dimes + " dime, ");

					}

				} else if (totalChange >= 0.05) {
					// give nickels
					nickels = (int) (totalChange / 0.05);
					totalChange = totalChange - (nickels * 0.05);

					if (nickels > 1) {
						System.out.print((int) nickels + " nickels, ");

					} else {
						System.out.print((int) nickels + " nickel, ");

					}

				} else {
					// give pennies
					int pennies = (int) ((totalChange / 0.01) + 0.5);
					totalChange = (int) totalChange - (pennies * 0.01);

					if (pennies > 1) {
						System.out.print((int) pennies + " pennies. ");

					} else {
						System.out.print((int) pennies + " penny. ");

					}

				}

			}

		}
		kb.close();
	}
}