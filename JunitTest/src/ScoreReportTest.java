import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreReportTest {
	private final double DELTA = 0.001;


	@Test
	public void testAddScore0() {
		ScoreReport scoreReport = new ScoreReport();
		scoreReport.addScore(0);
		assertEquals(scoreReport.getSum(), 0);
	}
	
	@Test
	public void testAddScore100() {
		ScoreReport scoreReport = new ScoreReport();
		scoreReport.addScore(100);
		assertEquals(scoreReport.getSum(), 100);
	}
	
	@Test
	public void testAddScore200() {
		ScoreReport scoreReport = new ScoreReport();
		for (int i=0; i<20; i++)
			scoreReport.addScore(10);
		assertEquals(scoreReport.getSum(), 200);
	}


	@Test
	public void testGetAverage() {
		ScoreReport scoreReport = new ScoreReport();
		for (int i=0; i<20; i++)
			scoreReport.addScore(10);
		
		assertEquals(10, scoreReport.getAverage(), DELTA);
	}


}
