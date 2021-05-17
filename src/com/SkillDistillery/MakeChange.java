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
		total *= 100;	//convert to pennies
		
		//Prompt 2:
		System.out.print("Enter amount to pay: ");
		double payedAmt =  kb.nextDouble();
		payedAmt *= 100;	//convert to pennies
		
		//Calculate change/amount owed
		while(true) {	
			change = payedAmt - total;
			if(change < 0){
				change = change * -1 *0.01;
				//System.out.println("You still owe $" + (change * -1 * 0.01));
				System.out.printf("You still owe $%.2f%n", change);
				System.out.print("Enter additional amount to pay: ");
				payedAmt += kb.nextDouble() * 100;
			}else {
				break;
			}
		}
		
		//convert dollar amount from pennies back to dollars
		total *= 0.01;
		payedAmt *= 0.01;
		change *= 0.01;
		
		//Prompt for higher denominations if change is more than 100 dollars
		boolean higherDenoms = true;
		if(change >= 100)
			{
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
		}
		
		
		System.out.printf("%nTotal Cost: $%.2f", total);
		System.out.printf("%nAmount Payed Cost: $%.2f", payedAmt);
		System.out.printf("%nChange Owed: $%.2f%n", change);
		
		//System.out.println("\nTotal Cost: $" + total);
		//System.out.println("Amount Payed: $" + payedAmt);
		//System.out.println("Change Owed: $" + change);
		
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
		System.out.println("-------------");
		
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
					//System.out.println(quarters + " quarter(s). (x0.25) = $" + (quarters*0.25));
					System.out.printf("%d quarter(s). (x.25) = $%.2f%n", quarters, (quarters * 0.25));

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
				if(dimes > 0) {
					//dimes *= 0.10;
					//System.out.println(dimes + " dime(s). (x0.10) = $" + (dimes*0.10));
					System.out.printf("%d dime(s). (x.10) = $%.2f%n", dimes, (dimes * 0.10));
				}
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
					System.out.println(nickles + " nickle(s). (x0.05) = $" + (nickles*0.05));
				break;
			}
		}
		
		//pennies
		while(true) {
			if(change < 0.01 && change * 1000 > 0.5)
			{
				pennies++;	//to take care of rounding errors under 1 cent...
			}
			if(change >= 0.01) {
				change -= 0.01;
				pennies++;
			} 
			else {
				if(pennies > 0)
				System.out.println(pennies + " penny(s). (x0.01) = $" + (pennies*0.01));
				//System.out.println(change);
				break;
			}
		}
		
		System.out.printf("%n%nCalculated change: $%.2f", ((hundredBills * 100) + (fiftyBills * 50) + (twentyBills * 20) + (tenBills * 10) + (fiveBills * 5) + (oneBills * 1) + (quarters * 0.25) + (dimes * 0.10) + (nickles * 0.05) + (pennies * 0.01)));
	}
}
