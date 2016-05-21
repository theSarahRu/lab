package banking;
/**
 * Creates an account and allows withdrawal and deposits and transfers. Intended to represent Bank account.
 * @author Sarah R M
 *
 */
public class Account {
	
	
	protected double balance;
	protected int accountNum;
	//consider creating a person object
	protected String owner;
	protected double minBalance;
	//type
	
	//constructor
	public Account(double balance, int accountNum, String owner, double minBalance) 
	{
		if(balance < 0)
		{
			throw new IllegalArgumentException();
		}
		this.balance = balance;
		this.accountNum = accountNum;
		this.owner = owner;
		this.minBalance = minBalance;
	}
	//check balance
	public double getBalance()
	{
		return this.balance;
	}
	/**
	 * Withdraws from this account if withdrawal leaves > MIN_BALANCE
	 * @param amount - amount to be withdrawn
	 * @return - true if successful
	 */
	public boolean withdraw(double amount)
	{
		if(this.balance - minBalance >= amount)
		{
			this.balance -= amount;
			return true;
		}
		else
		{
			return false;
		}
	} 
	//getAccountNumb
	//getType
	//getOwner
	//deposit
	public void deposit(double depositAmount)
	{
		if(depositAmount > 0)
		{
			this.balance += depositAmount;
		}
		//if negative, throw an exception
	}
	//overdraft notice
	//transfer
	public boolean transfer(double amount, Account to)
	{
		if(this.withdraw(amount))
		{
			to.deposit(amount);
			return true;
		}
		System.out.println("Transfer failed.");
		return false;
	}
	//toString
	
	public static void main(String args[])
	{
		
		Account sarahsAccount = new Account(100, 1, "SRM", 25);
		System.out.println("Original Balance: " + sarahsAccount.getBalance());
		sarahsAccount.withdraw(45);
		System.out.println("New Balance: " + sarahsAccount.getBalance());
		Account zachsAccount = new Account(1000, 2, "Zach", 25);
		zachsAccount.transfer(500, sarahsAccount);
		System.out.print("Transfer Succesful. New Balance: " + sarahsAccount.getBalance());
		System.out.println("\nZach's New Balance: " + zachsAccount.getBalance());
	}
}