package Rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testGetArea() {
		Rectangle a = new Rectangle(3, 4);
		assertTrue("Trouble calculating area", a.getArea() == 12);
	}
	@Test
	public void testGetPeri() {
		Rectangle a = new Rectangle(3, 4);
		assertTrue("Trouble calculating perimeter", a.getPeri() == 14);
	}
	@Test
	public void testIsLarger() {
		Rectangle a = new Rectangle(3, 4);
		Rectangle b = new Rectangle(5, 6);
		assertTrue("Trouble comparing areas", a.isLarger(b.getArea()) == false);
	}
	@Test
	public void testIsSquare() {
		Rectangle a = new Rectangle(3, 4);
		assertTrue("Does not recognize squares", a.isSquare() == false);
	}
}
