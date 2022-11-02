package com.Banking_System;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Banking Management System.");
		
		Scanner forInt  = new Scanner(System.in);
		Scanner forString  = new Scanner(System.in);
		Account acc = new Account();
		
		System.out.println("Type Y to open new account, Type N if you already have an account.");
		
		
		String ans = forString.nextLine();
		
		if(ans.equals("Y"))
		{
			System.out.print("Select Bank : 1.SBI 2. PNB 3. ICICI: ");
			int bank = forInt.nextInt();
			acc.openAcc(bank);
			try
			{
				FileWriter miniStmt = new FileWriter("ministmt.txt");
				miniStmt.write("Name  Type  typeAcc\n");
				miniStmt.write("--------------------------------------------------------------\n\n\n");
				miniStmt.write(acc.STMT);
				miniStmt.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		
		if(ans.equals("N"))
		{
			System.out.print("Choose your Bank: 1.SBI  2. PNB 3. ICICI: ");
			int bankName = forInt.nextInt();
			System.out.print("Type of Account: saving / current: ");
			String existAccType = forString.nextLine();
			System.out.print("Enter your account number: ");
			int accountNo = forInt.nextInt();
			
			acc.accDetails(existAccType, bankName, accountNo);
			
			
		}
		
		forInt.close();
		forString.close();
	}
}
