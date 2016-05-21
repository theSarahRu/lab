package banking;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

//	@Before
//	public void setUp()	{
//		
//	}
//	@After
//	public void cleanup() 	{
//		
//	}
	
	@Test
	public void testWithdrawSuccess() {
		Account a = new Account(500, 1, "Test", 25);
		assertTrue("Initial balance incorrect.", a.getBalance() == 500);
		assertTrue("Successful withdrawal does not return true.", a.withdraw(475) == true);
		assertTrue("Withdraw does not update balance correctly.", a.getBalance() == 25);
	}
	@Test
	public void testWithdrawFail() {
		Account a = new Account(500, 1, "Test", 25);
		assertTrue("Problem with unsuccessful withdrawal.", a.withdraw(600) == false);
		assertTrue("Problem with withdrawal block.", a.getBalance() == 500);
	}
	@Test
	public void testNegativeBalance() {
		try {
			Account a = new Account(-500, 1, "Test", 25);
		}
		catch(IllegalArgumentException e) {
			assertTrue(true);
		}
		catch(Exception e)
		{
			fail("Didn't throw right exception.");
		}
		
	}
	

}
