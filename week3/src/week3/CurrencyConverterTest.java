package week3;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Test;

public class CurrencyConverterTest {

	@Test
	public void testDollorToeuroOnce() {
		ExchangeRate mock = EasyMock.createMock(ExchangeRate.class);
		EasyMock.expect(mock.getRate("USD", "EUR")).andReturn(1.5F);
		EasyMock.replay(mock);
		
		CurrencyConverter testObject = new CurrencyConverter("USD", mock);
		float expected = 3.5F;
		float actual = testObject.toEuros(2.5F);
		assertEquals(expected, actual, 0.1);
		
		EasyMock.verify(mock);
	}
}
