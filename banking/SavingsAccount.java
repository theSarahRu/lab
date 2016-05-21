package banking;

public class SavingsAccount extends Account {

	//private double interestRate;
	private final int MAX_WITHDRAWALS = 6;
	private int withdrawals;
	private Compoundable interestStrategy;
	
	public SavingsAccount(double balance, int accountNum, String owner, Compoundable interestStrategy)
	{
		super(balance, accountNum, owner, 25);
		//this.interestRate = interestRate;
		this.withdrawals = 0;
		this.interestStrategy = interestStrategy;
	}
	
	//compound interest
	public void compoundInterest()
	{
		this.balance = this.interestStrategy.compoundInterest(this.balance);
	}
	//track withdrawals
	public boolean withdraw(double amount)
	{
		if(this.withdrawals < this.MAX_WITHDRAWALS)
		{
			boolean result = super.withdraw(amount);
			if(result)
			{
				this.withdrawals++;
			}
			return result;
		}
		return false;
	}
	
	public static void main (String[] args)
	{
		NonContinuousStrategy nc = new NonContinuousStrategy(12, 0.2);
		SavingsAccount a = new SavingsAccount(100, 001, "Sarah", nc);
		ContinuousStrategy cs = new ContinuousStrategy(0.2);
		SavingsAccount b = new SavingsAccount(100, 002, "Sarah", cs);
		a.compoundInterest();
		b.compoundInterest();
		System.out.println("NonContinuous: " + a.getBalance());
		System.out.println("Continuous: " + b.getBalance());
		
		
	}
}
