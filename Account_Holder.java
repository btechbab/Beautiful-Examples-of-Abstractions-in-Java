package com;

import java.util.Scanner;

public class Account_Holder {
	public static void main(String[] args) {
		//		UP-CASTING
		Bank B= new ATM();
		Scanner Sc1= new Scanner(System.in);
		
		while(true) {
			System.out.println("1.DEPOSIT\n2.WITHDRAW\n3.CHECK BALANCE\n4.EXIT\n");
			System.out.println("Enter Your Choice :\n");;
			int Choice =Sc1.nextInt();
			switch(Choice) {
			case 1:
				System.out.println("Enter Amout to Be Deposited\n");
				//			int AmountToDeposit=Sc1.nextInt();
				B.Deposit(Sc1.nextInt());;
				break;
			case 2:
				System.out.println("Enter Amout to Be WIthdrawn\\n");
				//			int AmountToDeposit=Sc1.nextInt();
				B.Deposit(Sc1.nextInt());;
				break;
			case 3:
				B.CheckAmount();
				break;
			case 4:
				System.out.println("Have A Nice Day! Thankyou For Banking.!\\n");
				//			int AmountToDeposit=Sc1.nextInt();
				B.Deposit(Sc1.nextInt());;
				System.exit(0);
			default : System.out.println("Sorry Come Again!");

			}
		}
	}
}
