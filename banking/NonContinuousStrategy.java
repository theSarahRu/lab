package banking;

public class NonContinuousStrategy implements Compoundable {

	private int periods;
	private double interestRate;
	
	public NonContinuousStrategy(int periods, double interestRate){
		this.periods = periods;
		this.interestRate = interestRate;
	}
	@Override
	public double compoundInterest(double balance) {
		// TODO Auto-generated method stub
		double rOverN = 1 + this.interestRate / this.periods;
		rOverN = Math.pow(rOverN, this.periods);
		balance = balance * rOverN;
		return balance;
	}
	//get interest rate
}
