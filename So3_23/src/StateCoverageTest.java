import static org.junit.Assert.*;

import org.junit.Test;

public class StateCoverageTest {
	@Test
	public void StateFirst(){
		StringStack str = new StringStack();
		assertEquals(true, str.isEmpty());
	}
	@Test
	public void StateSecond(){
		StringStack str = new StringStack();
		str.push("hello");
		assertEquals(false, str.isEmpty());
		assertEquals(false, str.isFull());
	}
	
	@Test
	public void StateMax(){
		StringStack str = new StringStack();
		
		for (int i=0; i<str.getMaxSize(); i++){
			str.push("hello");	
		}
		
		assertEquals(true, str.isFull());
	}
}
