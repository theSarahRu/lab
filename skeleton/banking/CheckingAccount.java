package banking;

public class CheckingAccount extends Account {
	
	private boolean overdraftProtection;
	
	public CheckingAccount(double balance, int accountNum, String owner, boolean overdraftProtection)
	{
		super(balance, accountNum, owner, 0);
		this.overdraftProtection = overdraftProtection;
	}
	//charge overdraft fee
	public boolean withdraw(double amount)
	{
		if(this.overdraftProtection = false)
		{
			super.withdraw(amount);
		}
		else
		{
			
		}
	}

}
