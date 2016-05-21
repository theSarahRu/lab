package Fraction;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTester {

	@Test
	public void testAddFractionFail() {
		Fraction a = new Fraction(44, 88);
		assertTrue("Trouble creating fraction", a.getDenom() == 88);
		//Fraction b = new Fraction (1, 2);
		Fraction c = a.addFraction(1, 2);
		assertTrue("Trouble failing complicated addition", c.getNum() == 44);
	}
	@Test
	public void testAddFractionSuccess() {
		Fraction a = new Fraction(44, 88);
		assertTrue("Trouble creating fraction", a.getDenom() == 88);
		//Fraction b = new Fraction (1, 88);
		//assertTrue("Trouble creating fraction", b.getDenom() == 88);
		Fraction c = a.addFraction(1, 88);
		assertTrue("Trouble adding fractions", c.getNum() == 45);
	}
	@Test
	public void testMultiplyFraction() {
		Fraction a = new Fraction(4, 8);
		Fraction b = a.multiplyFraction(1, 2);
		assertTrue("Trouble multiplying numerator", b.getNum() == 4);
		assertTrue("Trouble multiplying denominator", b.getDenom() == 16);
	}
	@Test
	public void testGetReciprocal() {
		Fraction a = new Fraction(4, 8);
		Fraction b = a.getReciprocal();
		assertTrue("Trouble with getting reciprocal", b.getNum() == 8);
		assertTrue("Trouble with getting reciprocal", b.getDenom() == 4);
	}
	@Test
	public void testSimplifyFraction() {
		Fraction a = new Fraction(4, 8);
		Fraction b = a.simplifyFraction();
		assertTrue("Trouble simplifying numerator", b.getNum() == 1);
		assertTrue("Trouble simplifying denominator", b.getDenom() == 2);
	}
}
