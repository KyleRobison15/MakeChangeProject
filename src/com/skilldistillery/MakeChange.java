package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the price of your item?");
		double itemPrice = kb.nextDouble();
		
		System.out.println("How much money did you tender?");
		double amountTendered = kb.nextDouble();
		
		if (amountTendered < itemPrice) {
		System.out.println("You did not tender enough to purchase this item! Please give me more money. Aghhhh!");
		
		}
		else if (amountTendered == itemPrice){
		System.out.println("Thank you. Come again!");
			
		}
		
		else {
			
			changeNeeded(); //calling the method changeNeeded()
			
		}
		
		
	}

	public static void changeNeeded() {
		System.out.println("Your change is: ");
		
		
		
	}
	
}