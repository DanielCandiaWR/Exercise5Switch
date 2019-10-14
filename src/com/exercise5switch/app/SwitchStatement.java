package com.exercise5switch.app;
import java.util.*;
import java.io.*;
public class SwitchStatement {
	public static void main(String[] args) {
		//Constant declaration
		
		//Variables declaration
		int monthNumber=0;
		String message = "";
		char answer = 'y';
		//Object Contructor
		Scanner scan = new Scanner(System.in);	
		do {
			monthNumber=0;
			//Input data validation
			while(monthNumber<=0 || monthNumber>12){
				System.out.print("Input a number of month: ");
				monthNumber = scan.nextByte();
				if(monthNumber<=0) {
					System.out.println("Invalid number");
				}
				if(monthNumber>12) {
					System.out.println("Invalid number");
				}
			}	
			switch(monthNumber) {
				case 1:
					message = "January";
					break;
				case 2:
					message = "February";
					break;
				case 3:
					message = "March";
					break;
				case 4:
					message = "April";
					break;
				case 5:
					message = "May";
					break;
				case 6:
					message = "June";
					break;
				case 7:
					message = "July";
					break;
				case 8:
					message = "August";
					break;
				case 9:
					message = "September";
					break;
				case 10:
					message = "October";
					break;
				case 11:
					message = "November";
					break;
				case 12:
					message = "December";
					break;
				default:
					message = "Invalid!!";
					break;
			}
			System.out.println("Your number of month is "+message);
			System.out.print("Do you want to input another number?(y/n) ");
			answer = scan.next().charAt(0);
			answer = Character.toLowerCase(answer);
		}while(answer=='y');
		System.out.println("Bye");
		//Object Destructor
		scan.close();
	}
}
