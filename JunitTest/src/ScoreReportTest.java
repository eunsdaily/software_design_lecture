import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreReportTest {

	@Test
	public void testAddTwoScore() {
		ScoreReport scoreReport = new ScoreReport();
		for (int i=0; i<20; i++)
			scoreReport.addScore(10);
		assertEquals(scoreReport.getSum(), 200);
	}

	@Test
	public void testAllScoreAverage() {
		ScoreReport scoreReport = new ScoreReport();
		for (int i=0; i<20; i++)
			scoreReport.addScore(10);
		
		assertEquals(10, scoreReport.getAverage());
	}
}
