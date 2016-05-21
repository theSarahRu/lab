package banking;

import java.util.ArrayList;


public class Bank {
	
	private String name;
	private String location;
	private int routingNum;
	private ArrayList<SavingsAccount> savingsList;
	private ArrayList<CheckingAccount> checkingList;
	//vault
	//assets
	
	//constructor
	public Bank(String name, String location, int routingNum)
	{
		this.name = name;
		this.location = location;
		this.routingNum = routingNum;
		this.savingsList = new ArrayList<SavingsAccount>();
		this.checkingList = new ArrayList<CheckingAccount>();
	}
	//getters
	//open an account
	public boolean createAccount(double balance, String owner, boolean isChecking)
	{
		if(isChecking = false)
		{
			int accountNum = savingsList.size() + 1;
			SavingsAccount newAccount = new SavingsAccount(balance, accountNum, owner, .25);
			this.savingsList.add(newAccount);
			if(savingsList.size() == accountNum + 1)
			{
				return true;
			}
		}
		else
		{
			int accountNum = checkingList.size() + 1;
			CheckingAccount newAccount  = new CheckingAccount(balance, accountNum, owner, true);
			this.checkingList.add(newAccount);
			if(checkingList.size() == accountNum + 1)
			{
				return true;
			}
		}
		
		System.out.println("Account not opened.");
		return false;
	}
	
	//close an account
	//rob
	//deposit
	public void deposit(double amount, int accountNum)
	{
		//find index
		Account a = accounts.get(accountNum - 1);
		a.deposit(amount);
	}
	//withdraw
	public void withdraw(double amount, int accoutNum)
	{
		Account a = accounts.get(accoutNum - 1);
		a.withdraw(amount);
	}
	
	//toString
	public String toString()
	{
		return "Bank: " + this.name + " is located at: " + this.location + ". Routing number: " + this.routingNum + " Number of Accounts: " + accounts.size();
	}
}
