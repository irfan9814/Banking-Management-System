package com.Banking_System;

abstract class RBI  {
	
	
	double rbiInterestRateSaving = 5;
	double rbiInterestRateCurrent = 8;
	int deposite , withdraw;
	double enteredTime, totalInterest,EnteredAmount ;
	
	public abstract void createAcc(String name,String accType, String DOB);
	
	public double SavingInterest(double enteredTime , double EnteredAmount)
	{
		totalInterest = EnteredAmount*enteredTime*(rbiInterestRateSaving/100)/365;
		
		return totalInterest;
	}
	
	public double CurrentInterest(double enteredTime , double EnteredAmount)
	{
		totalInterest = EnteredAmount*Math.pow(1+(rbiInterestRateCurrent/ 2),2*enteredTime);
		
		return totalInterest;
	}
}
