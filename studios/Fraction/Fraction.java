package Fraction;

import static org.junit.Assert.assertTrue;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	//constructor
	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	//get numerator
	public int getNum()
	{
		return this.numerator;
	}
	//get denominator
	public int getDenom()
	{
		return this.denominator;
	}
	//add to another fraction, only if denominators are same
	public Fraction addFraction(int numerator, int denominator)
	{
		if(this.denominator == denominator)
		{
			int newNum = this.numerator + numerator;
			Fraction sum = new Fraction(newNum, denominator);
			return sum;
		}
		else
		{
			Fraction orig = new Fraction(this.numerator,this.denominator);
			return orig;
		}
	}
	
	public Fraction multiplyFraction(int numerator, int denominator)
	{
		int newNum = this.numerator * numerator;
		int newDenom = this.denominator * denominator;
		Fraction product = new Fraction(newNum, newDenom);
		return product;
	}
	//give reciprocal
	public Fraction getReciprocal()
	{
		Fraction recip = new Fraction(this.denominator, this.numerator);
		return recip;
	}
	//simplify fraction
	public Fraction simplifyFraction()
	{
		int i = 9;
		int newNum;
		int newDenom;
		while(i > 0)
		{
			if(this.numerator % i == 0 && this.denominator % i == 0)
			{
				newNum = this.numerator/i;
				newDenom = this.denominator/i;
				Fraction simplified = new Fraction(newNum, newDenom);
				return simplified;
			}
			else
			{
				i--;
			}
		}
		Fraction orig = new Fraction(this.numerator, this.denominator);
		return orig;
	}
	//toString
	public String toString()
	{
		return "Fraction: " + this.numerator + "/" + this.denominator; 
	}
	
	public static void main(String args[])
	{
		Fraction firstFrac = new Fraction(34, 99);
		System.out.println(firstFrac.simplifyFraction());
		Fraction Fraction2 = new Fraction(4, 44);
		System.out.println(Fraction2.simplifyFraction());
		
		Fraction a = new Fraction(44, 88);
		System.out.println(a.getDenom());
		Fraction b = new Fraction (1, 88);
		System.out.println(b.getDenom());
		Fraction c = a.addFraction(b.getNum(), b.getDenom());
		System.out.println(c);
	}
}