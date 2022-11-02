package com.Banking_System;

import java.util.Scanner;

public class Account {
	
	Scanner forInt  = new Scanner(System.in);
	Scanner forString  = new Scanner(System.in);

	public int accountNo,balance,newAccDep;
	public String name , typeAcc , DOB, STMT;

	
	public int getAccNo() {
		return accountNo;
	}

	public void setAccNo(int accNo) {
		this.accountNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String gettypeAcc() {
		return typeAcc;
	}

	public void settypeAcc(String typeAcc) {
		this.typeAcc = typeAcc;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	public int getnewAccDep() {
		return newAccDep;
	}

	public void setnewAccDep(int newAccDep) {
		this.newAccDep = newAccDep;
	}


		
	public void openAcc(int bank)
	{
		System.out.print("Enter your name: ");
		name = forString.nextLine();
		System.out.print("Enter the type of account: Saving / Current: ");
		typeAcc = forString.nextLine();
		System.out.print("Enter your DOB (DD-MM-YYYY) : ");
		DOB = forString.nextLine();
		
		if(bank == 1)
		{
			SBI sbi = new SBI();
			sbi.createAcc(name, typeAcc, DOB);
			int b =sbi.i;
			STMT = name+"  "+typeAcc+"  "+b; 
			System.out.println(STMT);
		}
		if(bank == 2)
		{
			PNB pnb = new PNB();
			pnb.createAcc(name, typeAcc, DOB);
			int b =pnb.i;
			STMT = name+"  "+typeAcc+"  "+b; 
			System.out.println(STMT);
		}
		if(bank == 3)
		{
			ICICI icici = new ICICI();
			icici.createAcc(name, typeAcc, DOB);
			int b =icici.i;
			STMT = name+"  "+typeAcc+"  "+b; 
			System.out.println(STMT);
		}
	}
	
	public void accDetails(String accType, int bankCode, int accNo1)
	{
		
		if(bankCode == 1)
		{
			SBI sbi = new SBI();
			sbi.details(accType, accNo1);
		}
		if(bankCode == 2)
		{
			PNB pnb = new PNB();
			pnb.details(accType, accNo1);
		}
		if(bankCode == 3)
		{
			ICICI icici = new ICICI();
			icici.details(accType, accNo1);
		}
	}


}
