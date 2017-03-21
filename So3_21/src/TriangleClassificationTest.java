import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleClassificationTest {
	TriangleClassification Try = new TriangleClassification();
	
	@Test
	public void testInvalidA0() {
		assertEquals(0, Try.triangle(0, 1, 2));
	}

	@Test
	public void testInvalidB0() {
		assertEquals(0, Try.triangle(1, 0, 2));
	}
	
	@Test
	public void testInvalidC0() {
		assertEquals(0, Try.triangle(1, 2, 0));
	}
	
	@Test
	public void testInvalidLargeA() {
		assertEquals(0, Try.triangle(4, 1, 2));
	}
	
	@Test
	public void testInvalidLargeB() {
		assertEquals(0, Try.triangle(2, 4, 1));
	}
	
	@Test
	public void testInvalidLargeC() {
		assertEquals(0, Try.triangle(2, 1, 4));
	}
	
	@Test
	public void testIsosceleAequalsB() {
		assertEquals(1, Try.triangle(3, 3, 2));
	}
	
	@Test
	public void testIsosceleAequalsC() {
		assertEquals(1, Try.triangle(3, 2, 3));
	}
	
	@Test
	public void testIsosceleBequalsC() {
		assertEquals(1, Try.triangle(2, 3, 3));
	}
	
	@Test
	public void testEquilateral() {
		assertEquals(2, Try.triangle(3, 3, 3));
	}
	
	@Test
	public void testRightAngleTriangleHypotenuseC() {
		assertEquals(3, Try.triangle(3, 4, 5));
	}
	
	@Test
	public void testRightAngleTriangleHypotenuseA() {
		assertEquals(3, Try.triangle(5, 4, 3));
	}
	
	@Test
	public void testRightAngleTriangleHypotenuseB() {
		assertEquals(3, Try.triangle(3, 5, 4));
	}
	
	@Test
	public void testTriangle() {
		assertEquals(4, Try.triangle(3, 4, 6));
	}
}
