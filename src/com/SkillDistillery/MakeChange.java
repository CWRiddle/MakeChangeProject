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
		
		System.out.println("\nTotal: $" + total);
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
		
		//hundreds
		while(true) {
			if(change >= 100) {
				change -= 100;
				hundredBills++;
			} 
			else {
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
				break;
			}
		}
		
		//twenties
		while(true) {
			if(change >= 20) {
				change -= 20;
				twentyBills++;
			} 
			else {
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
				break;
			}
		}
		
		//System.out.println("hundredBills: " + hundredBills);
		System.out.println("\nChange Given: ");
		System.out.println("-----------------");
		System.out.println("hundred bills: " + hundredBills + " (x100) = " + (hundredBills*100) + " dollars");
		System.out.println("fifty bills: " + fiftyBills + " (x50) = " + (fiftyBills*50) + " dollars");
		System.out.println("twenty bills: " + twentyBills + " (x20) = " + (twentyBills*20) + " dollars");
		System.out.println("ten bills: " + tenBills + " (x10) = " + (tenBills*10) + " dollars");
		System.out.println("five bills: " + fiveBills + " (x5) = " + (fiveBills*5) + " dollars");
		System.out.println("one bills: " + oneBills + " (x1) = " + (oneBills*1) + " dollars");
		System.out.println("quarters: " + quarters + " (x0.25) = " + (quarters*0.25) + " dollars");
		System.out.println("dimes: " + dimes + " (x0.10) = " + (dimes*0.10) + " dollars");
		System.out.println("nickles: " + nickles + " (x0.05) = " + (nickles*0.05) + " dollars");
		System.out.println("pennies: " + pennies + " (x0.01) = " + (pennies*0.01) + " dollars");
	
	}
}
