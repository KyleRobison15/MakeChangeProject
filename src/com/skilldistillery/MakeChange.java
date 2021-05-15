package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		double itemPrice, amountTendered;
		 
		System.out.println("What is the price of your item?");
		itemPrice = kb.nextDouble();
		
		System.out.println("How much money did you tender?");
		amountTendered = kb.nextDouble();
		
		if (amountTendered < itemPrice) {
		System.out.println("You did not tender enough to purchase this item! Please give me more money. Aghhhh!");
		
		}
		else if (amountTendered == itemPrice){
		System.out.println("Thank you. No change is needed. Come again!");
			
		}
		
		else {
			
			while (itemPrice > 0) {
				changeNeeded(itemPrice, amountTendered); //calling the method changeNeeded()
				
			}
				
			}
			kb.close();
		}
		

	public static void changeNeeded(double itemPrice, double amountTendered) {
		System.out.println("" ); //TODO build out the changeNeeded method to find denominations of change to be returned
		
		
		
	}
	
}