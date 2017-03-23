import static org.junit.Assert.*;

import org.junit.Test;

public class TransitionCoverageTest {
	
	@Test
	public void T1Test(){
		StringStack str = new StringStack();
		assertEquals(true, str.isEmpty());
	}
	
	@Test
	public void T2Test(){
		StringStack str = new StringStack();
		str.push("T2");
		assertEquals(1, str.getSize());
	}
	
	@Test
	public void T3Test(){
		StringStack str = new StringStack();
		for (int i=0; i<str.getMaxSize()-1; i++){
			str.push("T3");
		}
		assertEquals(str.getMaxSize()-1, str.getSize());
	}
	//pop fail..? why?
	//if StringStacks size is MAX, pop doesn't run.
	
	@Test
	public void T4Test(){
		StringStack str = new StringStack();
		for (int i=0; i<str.getMaxSize(); i++){
			str.push("T4");
		}
		assertEquals(true, str.isFull());
	}
	
	@Test
	public void T5Test(){
		StringStack str = new StringStack();
		for (int i=0; i<str.getMaxSize(); i++){
			str.push("T5");
		}
		str.pop();
		assertEquals(str.getMaxSize()-1, str.getSize());
	}
	
	@Test
	public void T6Test(){
		StringStack str = new StringStack();
		for (int i=0; i<str.getMaxSize()-1; i++){
			str.push("T6");
		}
		str.pop();
		assertEquals(str.getMaxSize()-2, str.getSize());
	}
	
	@Test
	public void T7Test(){
		StringStack str = new StringStack();
		str.push("T7");
		str.pop();
		assertEquals(true, str.isEmpty());
	}
	//pop fail..? why?
	//if StringStacks size is 1, pop doesn't run.
	
	
}
