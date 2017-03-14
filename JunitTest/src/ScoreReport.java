import java.util.ArrayList;
import java.util.List;

public class ScoreReport {
	private List<Integer> scoreList;

	public ScoreReport() {
		scoreList = new ArrayList<Integer>();
	}

	public int getCount() {
		return scoreList.size();
	}

	public List<Integer> getScoreList() {
		return scoreList;
	}

	public void addScore(int inputScore) {
		scoreList.add(inputScore);
	}

	public void clearScore() {
		scoreList.clear();
	}

	public int getSum() {
		int sumScore = 0;
		for (int i = 0; i < scoreList.size(); i++) {
			sumScore += scoreList.get(i);
		}
		return sumScore;
	}

	public double getAverage() {
		System.out.println(getSum() / scoreList.size());
		return (double)(getSum() / scoreList.size());
	}

	public String getReport() {
		String report = "Input :";
		for (int score : scoreList) {
			report += " " + score;
		}
		report += "\nSum : " + getSum();
		report += "\nAverage : " + getAverage() + "\n\n";
		return report;
	}
}