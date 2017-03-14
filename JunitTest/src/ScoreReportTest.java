import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreReportTest {

	@Test
	public void testScoreReport() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetScoreList() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddScore() {
		ScoreReport scoreReport = new ScoreReport();
		for (int i=0; i<20; i++)
			scoreReport.addScore(10);
		assertEquals(scoreReport.getSum(), 200);
	}

	@Test
	public void testClearScore() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSum() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAverage() {
		ScoreReport scoreReport = new ScoreReport();
		for (int i=0; i<20; i++)
			scoreReport.addScore(10);
		
		assertEquals(10, scoreReport.getAverage());
	}

	@Test
	public void testGetReport() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
