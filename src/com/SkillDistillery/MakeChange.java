package com.SkillDistillery;
import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		
		//Variables
		Scanner kb = new Scanner(System.in);
		boolean looping = true;
		double change = 0;
		
		//Prompt 1:
		System.out.print("Enter the price of your purchase: ");
		double total = kb.nextDouble();
		
		//Prompt 2:
		System.out.print("Enter amount to pay: ");
		double payedAmt =  kb.nextDouble();
		
		//Calculate change/amount owed
		while(true) {	
			change = payedAmt - total;
			if(change < 0){
				System.out.println("You still owe " + (change * -1) + "dollars");
				System.out.print("Enter additional amount to pay: ");
				payedAmt += kb.nextDouble();
			}else {
				break;
			}
		}
		
		boolean higherDenoms = true;
		System.out.print("If applicable, would you like to recieve your change in higher denominations than twenty dollar bills?: ");
		String denominationChoiceInput = kb.next();
		switch(denominationChoiceInput) {
		case "yes":
		case "Yes":
		case "Y":
		case "y":
			higherDenoms = true;
			break;
		case "no":
		case "No":
		case "n":
		case "N":
			higherDenoms = false;
			break;
		default:
			System.out.println("Invalid input. Please try again. Type yes or no: ");
		}
		
		
		System.out.println("\nTotal Cost: $" + total);
		System.out.println("Amount Payed: $" + payedAmt);
		System.out.println("Change Owed: $" + change);
		
		int hundredBills = 0;
		int fiftyBills = 0;
		int twentyBills = 0;
		int tenBills = 0;
		int fiveBills = 0;
		int oneBills = 0;
		int quarters = 0;
		int dimes = 0;
		int nickles = 0;
		int pennies = 0;
		
		System.out.println("\nChange Given: ");
		System.out.println("-----------------");
		
		if(higherDenoms) {
			//hundreds
			while(true) {
				if(change >= 100) {
					change -= 100;
					hundredBills++;
				} 
				else {
					if(hundredBills > 0)
						System.out.println(hundredBills + " hundred dollar bill(s). (x100) = $" + (hundredBills*100));
						//System.out.printf("%f + hundred dollar bill(s). (x100) = $ + hundredBills*100", hundredBills);
					break;
				}
			}
			
			//fifties
			while(true) {
				if(change >= 50) {
					change -= 50;
					fiftyBills++;
				} 
				else {
					if(fiftyBills > 0)
						System.out.println(fiftyBills + " fifty dollar bill(s). (x50) = $" + (fiftyBills*50));
					break;
				}
			}
		}
		
		//twenties
		while(true) {
			if(change >= 20) {
				change -= 20;
				twentyBills++;
			} 
			else {
				if(twentyBills > 0)
					System.out.println(twentyBills + " twenty dollar bill(s). (x20) = $" + (twentyBills*20));
				break;
			}
		}
		
		//tens
		while(true) {
			if(change >= 10) {
				change -= 10;
				tenBills++;
			} 
			else {
				if(tenBills > 0)
					System.out.println(tenBills + " ten dollar bill(s). (x10) = $" + (tenBills*10));
				break;
			}
		}
		
		//fives
		while(true) {
			if(change >= 5) {
				change -= 5;
				fiveBills++;
			} 
			else {
				if(fiveBills > 0)
					System.out.println(fiveBills + " five dollar bill(s).(x5) = $" + (fiveBills*5));
				break;
			}
		}
		
		//ones
		while(true) {
			if(change >= 1) {
				change -= 1;
				oneBills++;
			} 
			else {
				if(oneBills > 0)
					System.out.println(oneBills + " one dollar bill(s). (x1) = $" + (oneBills*1));
				break;
			}
		}
		
		//quarters
		while(true) {
			if(change >= 0.25) {
				change -= 0.25;
				quarters++;
			} 
			else {
				if(quarters > 0)
					System.out.println(quarters + " quarters. (x0.25) = $" + (quarters*0.25));
				break;
			}
		}
		
		//dimes
		while(true) {
			if(change >= 0.10) {
				change -= 0.10;
				dimes++;
			} 
			else {
				if(dimes > 0)
					System.out.println(dimes + " dimes. (x0.10) = $" + (dimes*0.10));
				break;
			}
		}
		
		//nickles
		while(true) {
			if(change >= 0.05) {
				change -= 0.05;
				nickles++;
			} 
			else {
				if(nickles > 0)
					System.out.println(nickles + " nickles. (x0.05) = $" + (nickles*0.05));
				break;
			}
		}
		
		//pennies
		while(true) {
			if(change >= 0.01) {
				change -= 0.01;
				pennies++;
			} 
			else {
				if(pennies > 0)
				System.out.println(pennies + " pennies. (x0.01) = $" + (pennies*0.01));
				break;
			}
		}
	}
}
