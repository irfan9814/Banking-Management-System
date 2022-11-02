package com.Banking_System;

import java.util.Scanner;

public class SBI extends RBI {

	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	
	int i;
	Account acc[];
	Account getd = new Account(); 
	
	public void createAcc(String name,String accType, String DOB)
	{
		
		
		if(accType.equalsIgnoreCase("saving"))
		{
			System.out.println("You need to deposit a minimum of Rs 2000 to open a Saving Account: ");
			i  = sc.nextInt();
			
			if(i>=2000)
			{
				Account acc = new Account();
				acc.setnewAccDep(i);
			
				System.out.println(name+" your "+accType+" account has been opened in SBI");
				System.out.println("Your balance is : "+acc.getnewAccDep());
				
				System.out.println("Do yo want to calculate interest of saving account: Y/N");
				String interestYN = sc1.nextLine();
				if(interestYN.equals("Y"))
				{
					System.out.println("Enter amount for which you want to calculate interest");
					EnteredAmount = sc.nextDouble();
					System.out.println("Enter time in months for which you want to calculate interest");
					enteredTime = sc.nextDouble();
					double interest = SavingInterest(enteredTime, EnteredAmount);
					System.out.println("Total interest for "+EnteredAmount+" for "+enteredTime+" months is : "+ interest);
				}
			}
			else
			{
				System.out.println("Please deposit a minimum of Rs 2000");
			}
		}
		
		if(accType.equalsIgnoreCase("current"))
		{
			System.out.println("You need to deposit a minimum of Rs 5000 to open a Current Account: ");
			 i  = sc.nextInt();
			
			if(i>=5000)
			{
				Account acc = new Account();
				acc.setnewAccDep(i);
				System.out.println(name+" your "+accType+" account has been created in SBI");
				System.out.println("Your balance is: "+acc.getnewAccDep());
				
				System.out.println("Do yo want to calculate interest of current account: Y/N");
				String interestYN = sc1.nextLine();
				if(interestYN.equals("Y"))
				{
					System.out.println("Enter amount for which you want to calculate interest");
					EnteredAmount = sc.nextDouble();
					System.out.println("Enter time in years for which you want to calculate interest");
					enteredTime = sc.nextDouble();
					double interest = CurrentInterest(enteredTime, EnteredAmount);
					System.out.println("Total interest for "+EnteredAmount+" for "+enteredTime+" months is: "+ interest);
				}
			}
			else
			{
				System.out.println("Please deposit a minimum of Rs 5000.");
			}
		}
	}
	
	public void details(String accType , int accNo1)
	{
		
		if(accType.equalsIgnoreCase("saving"))
		{
			acc = new Account[2];
			Account account = new Account();
			account.setAccNo(112);
			account.setName("Irfan");
			account.settypeAcc("saving");
			account.setBalance(2000);
			
			Account account1 = new Account();
			account1.setAccNo(113);
			account1.setName("Ansari");
			account1.settypeAcc("saving");
			account1.setBalance(2500);
			
			acc[0] = account;
			acc[1] = account1;
			
			for(int i = 0; i<acc.length; i++)
			{				
				if(acc[i].getAccNo() == accNo1)
				{
					System.out.println();
					System.out.println("-------------your account details-------------------");
					System.out.println("Your account number is: "+acc[i].getAccNo());
					System.out.println("Account holder name is: "+acc[i].getName());
					System.out.println("Balance is : "+acc[i].getBalance());
					System.out.println("Your account type is: "+acc[i].gettypeAcc());
					System.out.println("-----------------------------------------------------");
					
					System.out.println("1.Deposit 2.Withdraw");
					int Y_N = sc.nextInt();
					
					if(Y_N == 1)
					{
						System.out.print("Enter the amount to deposit: ");
						deposite = sc.nextInt();
						acc[i].setBalance(acc[i].getBalance()+deposite); 
						System.out.println("New balance is: "+acc[i].getBalance());
					}
					if(Y_N == 2)
					{
						System.out.println("Your balance is: "+acc[i].getBalance());
						System.out.println("So please enter amount less then "+acc[i].getBalance());
						
						withdraw = sc1.nextInt();
							
						if(withdraw > acc[i].getBalance())
						{
							System.out.println("Amount is not valid;");
						}
						else
						{
							System.out.println(withdraw+" amount has been debited");
							acc[i].setBalance(acc[i].getBalance()-withdraw);
							System.out.println("New balance is: "+acc[i].getBalance());
						}
					}
					
					
				}
			}
		}
		
		else if(accType.equalsIgnoreCase("current"))
		{
			System.out.println("this is "+ accType);
			acc = new Account[2];
			
			Account account = new Account();
			account.setAccNo(114);
			account.setName("Irfan");
			account.settypeAcc("current");
			
			Account account1 = new Account();
			account1.setAccNo(115);
			account1.setName("Ansari");
			account1.settypeAcc("current");
			
			acc[0] = account;
			acc[1] = account1;
			
			for(int i = 0; i<acc.length; i++)
			{
				if(acc[i].getAccNo() == accNo1)
				{
					System.out.println();
					System.out.println("-------------your account details-------------------");
					System.out.println("Your account number is: "+acc[i].getAccNo());
					System.out.println("account holder name is: "+acc[i].getName());
					System.out.println("balance is: "+acc[i].getBalance());
					System.out.println("Your account type is: "+acc[i].gettypeAcc());
					System.out.println("-----------------------------------------------------");
					
					System.out.println("1.Deposit 2.Withdraw ");
					int Y_N = sc.nextInt();
					
					if(Y_N == 1)
					{
						System.out.print("Enter the amouunt to deposit: ");
						deposite = sc.nextInt();
						acc[i].setBalance(acc[i].getBalance()+deposite); 
						System.out.println("New balance is: "+acc[i].getBalance());
					}
					if(Y_N == 2)
					{
						System.out.println("Your balance is: "+acc[i].getBalance());
						System.out.println("So please enter amount less then "+acc[i].getBalance());
						
						withdraw = sc1.nextInt();
							
						if(withdraw > acc[i].getBalance())
						{
							System.out.println("Amount is not valid;");
						}
						else
						{
							System.out.println(withdraw+" amount has been debited");
							acc[i].setBalance(acc[i].getBalance()-withdraw);
							System.out.println("New balance is: "+acc[i].getBalance());
						}
					}
					
					
				}
			}
		}
		else
		{
			System.out.println("Please enter valid accouunt type");
		}
	}

}
