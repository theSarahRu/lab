package Quiz;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultChoiceTest {

	@Test
	public void testInitMultiList() {
		MultChoice a = new MultChoice("What is my name?", "S");
		a.initMultiList("Jane", "Sallie", "Go");
		String[] b = a.getOptions();
		assertTrue("Trouble initializing options", b[1] == "Jane");
	}

}
