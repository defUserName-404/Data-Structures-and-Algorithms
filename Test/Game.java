import solution.GameEntry;
import solution.Scores;

public class Game {
	public static void main(String[] args) {
		Scores scores = new Scores();

		scores.add(new GameEntry("Nafi", 20));
		scores.add(new GameEntry("Nafi", 40));
		scores.add(new GameEntry("HackerMan", 60));

		GameEntry[] highestScores = scores.getHighestScores();
		print(highestScores);
	}

	private static void print(GameEntry[] highestScores) {
		System.out.println("Rank\tName\tScore");

		for (int i = 0; i < highestScores.length; i++) {
			GameEntry gameEntry = highestScores[i];

			System.out.println((i + 1) + "\t" + gameEntry.name() + "\t" + gameEntry.score());
		}
	}
}