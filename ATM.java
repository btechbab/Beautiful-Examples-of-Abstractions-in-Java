package com;

public class ATM implements Bank {
	int Balance=1000;
	public void Deposit(int AmtToDeposit) {
		Balance=Balance+AmtToDeposit;
		System.out.println("Amount of Rs:"+AmtToDeposit+" is Deposited SucessFully!!!");
	}
	public void Withdraw(int AmtToWithdraw) {
		Balance=Balance+AmtToWithdraw;
		System.out.println("Amount of Rs:"+AmtToWithdraw+" is WithDrawn SucessFully!!!");

	}
	public void CheckAmount( ) {
		System.out.println("Balance Is in Your Account:::"+Balance);
	}
}
